package com.weixin.service.wx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.bike.ChargeRecordDao;
import com.weixin.po.ChargeRecordPo;

@Service
public class WxUserCenterService {
   @Autowired
   private ChargeRecordDao chargeRecordDao;
   
   // 查找历史充电记录
   public List<ChargeRecordPo> getHisChargeRecordList(Map<String,Object> param) throws Exception{
	   List<ChargeRecordPo> record= chargeRecordDao.getHisChargeRecordList(param);
	   return record;
   }
   
   // 查找当前充电记录简略列表
   public List<ChargeRecordPo> getDqcdList(String wxid) throws Exception{
	   List<ChargeRecordPo> record= chargeRecordDao.getDqcdList(wxid);
	   return record;
   }
   
   // 根据记录id查找充电详细信息
   public ChargeRecordPo getDqChargeRecord(String id) throws Exception{
	   ChargeRecordPo record= chargeRecordDao.getDqChargeRecord(id);
	   return record;
   }
}
