package com.weixin.service.bike;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.bike.CmpnDao;
import com.weixin.dao.bike.CmpnUserDao;
import com.weixin.dao.bike.RedPktDao;
import com.weixin.dao.bike.RedPktFlowDao;
import com.weixin.po.BikeUserPo;
import com.weixin.po.CmpnPo;
import com.weixin.po.CmpnUserPo;
import com.weixin.po.RedPktAccountFlowPo;
import com.weixin.po.RedPktAccountPo;

@Service
public class BikeCmpnService {
   @Autowired
   private CmpnDao cmpnDao;
   
   @Autowired
   private CmpnUserDao cmpnUserDao;
   
   @Autowired
   private RedPktDao redPktDao;
   
   @Autowired
   private RedPktFlowDao redPktFlowDao;
   
   /**
    * 根据营销活动id查找营销活动明细信息
    * @param cmpn_id
    * @return
    * @throws Exception
    */
   public CmpnPo getCmpnDetail(String cmpn_id,String userno) throws Exception{
	   Map<String,Object> m = new HashMap<String,Object>();
	   m.put("cmpn_id", cmpn_id);
	   m.put("userno", userno);
	   CmpnPo s = cmpnDao.getCmpnDetail(m);
	   
	   if(s != null){
		   //计算可参与次数
		   int ycycs = s.getYcycs();
		   
		   String cmpn_part_limit = s.getCmpn_part_limit();
		   if(!"-1".equals(cmpn_part_limit)){
			   s.setKcycs(Integer.parseInt(cmpn_part_limit) - ycycs);
		   }
		   
		   clnum(s);
	   }
	   
	   return s;
   }
   
   /**
    * 营销活动列表
    * @return
    * @throws Exception
    */
   public List<CmpnPo> getCmpnList() throws Exception{
	   List<CmpnPo> reP = cmpnDao.getCmpnList();
	   
	   for(CmpnPo s:reP){
		   clnum(s);
	   }
       return reP;
   }
   
   private void clnum(CmpnPo s){
	   String recharge_money = s.getRecharge_money(); // 充值金额
	   String presend_redpkt_money = s.getPresend_redpkt_money(); // 充值红包
	   
	   //如果充值金额和充值红包带小数点有值的情况下，处理成保留小数的情况，否则去掉小数
	   String[] recharge_moneys = recharge_money.split("\\.");
	   if("00".equals(recharge_moneys[1])){
		   s.setRecharge_money(recharge_moneys[0]);
	   }else{
		   String a = recharge_moneys[1];
		   //如果第二位是0，则取第一位小数,否则保留原有数字不变
		   if("0".equals(a.substring(1,2))){
			   s.setRecharge_money(recharge_money.substring(0,recharge_money.length()-2));
		   }
	   }
	   
	   String[] presend_redpkt_moneys = presend_redpkt_money.split("\\.");
	   if("00".equals(presend_redpkt_moneys[1])){
		   s.setPresend_redpkt_money(presend_redpkt_moneys[0]);
	   }else{
		   String a = presend_redpkt_moneys[1];
		   //如果第二位是0，则取第一位小数,否则保留原有数字不变
		   if("0".equals(a.substring(1,2))){
			   s.setPresend_redpkt_money(presend_redpkt_money.substring(0,presend_redpkt_money.length()-2));
		   }
	   }
   }
   
   public void insCmpnUser(CmpnUserPo m) throws Exception{
	   cmpnUserDao.insert(m);
   }
   
   /**
    * 根据微信openid获取红包账户信息
    * @param cmpn_id
    * @return
    * @throws Exception
    */
   public RedPktAccountPo getRedPktAccount(Map<String,Object> m) throws Exception{
	   RedPktAccountPo s = redPktDao.getRedPktAccount(m);
	   return s;
   }
   
   
   /**
    * 新增红包账户
    * @param m
    * @throws Exception
    */
   public void insRedPktAccount(RedPktAccountPo m) throws Exception{
	   redPktDao.insert(m);
   }
   
   /**
    * 红包流水
    * @return
    * @throws Exception
    */
   public List<RedPktAccountFlowPo> getRedPktFlowList(Map<String,Object> m) throws Exception{
	   List<RedPktAccountFlowPo> reP = redPktFlowDao.getRedPktFlowList(m);
       return reP;
   }
   
   /**
    * 充电支付时选择红包支付时 新增红包流水记录
    * @param m
    * @throws Exception
    */
   public boolean PlusHbAccount(RedPktAccountFlowPo m) throws Exception{
	   try{
		   redPktFlowDao.insert(m);
		   // 更新红包余额-
		   RedPktAccountPo p = new RedPktAccountPo();
		   p.setCharge_user_id(m.getCharge_user_id());
		   p.setRedpkt_balance(new Double(m.getJournal_money()));
		   redPktDao.updateById(p);
		   return true;
	   }catch(Exception e){
		   return false;
	   }
   }
   
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   
   /**
    * 红包充值或者红包退款时新增流水和更新记录
    * @param m
    * @throws Exception
    */
   public boolean AddHbAccount(RedPktAccountFlowPo m,CmpnUserPo cmpnUser) throws Exception{
	   try{
		   //充值赠送红包记录的更新
		   if(cmpnUser != null){
			   cmpnUserDao.updateById(cmpnUser);
			   
			   //只有支付成功的情况下，才更新流水
			   if("1".equals(cmpnUser.getRecharge_status())){
				 //流水记录表的增加
				   redPktFlowDao.insert(m);
				   // 更新红包余额+
				   RedPktAccountPo p = new RedPktAccountPo();
				   p.setCharge_user_id(m.getCharge_user_id());
				   p.setRedpkt_balance(new Double(m.getJournal_money()));
				   
				   logger.info(m.getCharge_user_id() + "用户   红包增加的金额为：" + m.getJournal_money());
				   redPktDao.updateAccountById(p);
			   }
		   }else{
			   //流水记录表的增加
			   redPktFlowDao.insert(m);
			   // 更新红包余额+
			   RedPktAccountPo p = new RedPktAccountPo();
			   p.setCharge_user_id(m.getCharge_user_id());
			   p.setRedpkt_balance(new Double(m.getJournal_money()));
			   redPktDao.updateAccountById(p);
		   }
		   
		   return true;
	   }catch(Exception e){
		   return false;
	   }
   }
   
   /**
    * 更新充值送红包记录
    * @param m
    * @throws Exception
    */
   public void updateCzs(CmpnUserPo m) throws Exception{
	   cmpnUserDao.updateById(m);
   }
   
   /**
    * 插入充值送红包记录
    * @param m
    * @throws Exception
    */
   public void insCzs(CmpnUserPo m) throws Exception{
	   cmpnUserDao.insert(m);
   }
   
   /**
    * 删除充值送红包记录
    * @param m
    * @throws Exception
    */
   public void delCzs(CmpnUserPo m) throws Exception{
	   cmpnUserDao.delCmpnUser(m);
   }
   
   /**
    * 根据充值送记录获取
    * @param CmpnUserPo
    * @return
    * @throws Exception
    */
   public CmpnUserPo getCmpnUser(CmpnUserPo p) throws Exception{
	   return cmpnUserDao.getCmpnUser(p);
   }
}
