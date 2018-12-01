package com.weixin.service.bike;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.bike.BikeUserDao;
import com.weixin.dao.bike.SmsDao;
import com.weixin.po.BikeUserPo;
import com.weixin.po.SmsPo;

@Service
public class BikeUserService {
   @Autowired
   private BikeUserDao bikeUserDao;
   @Autowired
   private SmsDao smsDao;
   
   public BikeUserPo findByWxid(String wxid) throws Exception{
	   return bikeUserDao.findByWxid(wxid);
   }
   
   public String findTokenByWxno(String wxno) throws Exception{
	   return bikeUserDao.findTokenByWxno(wxno);
   }
   
   // 更新自行车用户表-token字段
   public void updateToken(Map<String,String> m) throws Exception{
	   BikeUserPo bikeUser = new BikeUserPo();
       bikeUser.setChargeUserNo(m.get("openid"));
       bikeUser.setChargeUserToken(m.get("access_token"));
       bikeUser.setUnionId(m.get("unionid"));
       bikeUserDao.updateById(bikeUser);
   }
   
   // 插入自行车用户表
   public void insertYh(BikeUserPo bikeUser) throws Exception{
	   bikeUserDao.insert(bikeUser);
   }
   
   public void insertZfbYh(BikeUserPo bikeUser)
        throws Exception
    {
        bikeUserDao.insertZfbYh(bikeUser);
    }

    public void updateMobile(Map<String,String> m)
        throws Exception
    {
        BikeUserPo bikeUser = new BikeUserPo();
        bikeUser.setChargeUserNo(m.get("openid"));
        bikeUser.setChargeUserMobile(m.get("phone"));
        bikeUserDao.updPhoneByWxId(bikeUser);
    }

    public void insSmsLog(SmsPo m)
        throws Exception
    {
        smsDao.insert(m);
    }

    public boolean valSmscode(SmsPo m)
        throws Exception
    {
        SmsPo t = smsDao.findRecord(m);
        return t != null;
    }
}
