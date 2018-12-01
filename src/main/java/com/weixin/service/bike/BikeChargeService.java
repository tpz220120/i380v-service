package com.weixin.service.bike;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.bike.ChargeDevDao;
import com.weixin.dao.bike.ChargeLogDao;
import com.weixin.dao.bike.ChargePlugDao;
import com.weixin.dao.bike.ChargeRecordDao;
import com.weixin.dao.bike.ChargeStationDao;
import com.weixin.dao.bike.ChargeTjDao;
import com.weixin.dao.bike.CheckDevDao;
import com.weixin.po.BindDevPo;
import com.weixin.po.ChargeDevPo;
import com.weixin.po.ChargePlugPo;
import com.weixin.po.ChargeRecordPo;
import com.weixin.po.ChargeStationPo;
import com.weixin.po.ChargeTjPo;

@Service
public class BikeChargeService {
   @Autowired
   private ChargePlugDao chargePlugDao;
   
   @Autowired
   private ChargeStationDao chargeStationDao;
   
   @Autowired
   private ChargeDevDao chargeDevDao;
   
   @Autowired
   private ChargeRecordDao chargeRecordDao;
   
   @Autowired
   private ChargeLogDao chargeLogDao;
   @Autowired
   private CheckDevDao checkDevDao;
   @Autowired
   private ChargeTjDao chargeTjDao;
   
   public ChargePlugPo getChargePlugInfo(String plugno) throws Exception{
	   return chargePlugDao.getChargePlugInfo(plugno);
   }
   
   public ChargePlugPo getChargePlugInfo2(String plugno,String orgno) throws Exception{
	   Map<String,String> m = new HashMap<String,String>();
	   m.put("plugno", plugno);
	   m.put("orgno", orgno);
	   return chargePlugDao.getChargePlugInfo2(m);
   }
   
   public List<ChargeStationPo> getChargeStationList(Map<String,Object> m) throws Exception{
	   //return chargeStationDao.getChargeStationList(m);
	   
	   List<ChargeStationPo> reP = chargeStationDao.getChargeStationList(m);
       for(ChargeStationPo s:reP)
       {
           String chargeDevNo = "";
           Map<String, Object> a = new HashMap<String, Object>();
           a.put("id", s.getId());
           List<ChargeDevPo> devP = chargeDevDao.getChargeDevByStation(a);
           if(devP != null && devP.size() != 0)
           {
               for(ChargeDevPo dev:devP)
               {
                   chargeDevNo = (new StringBuilder()).append(chargeDevNo).append(dev.getChargedeviceNo()).append(",").toString();
               }

               s.setChargeDevNo(chargeDevNo.substring(0, chargeDevNo.length() - 1));
           } else
           {
               s.setChargeDevNo("");
           }
       }

       return reP;
   }
   
   public List<ChargeStationPo> getGlStationList(Map<String,Object> m) throws Exception{
	   List<ChargeStationPo> pList = chargeStationDao.getGlStationList(m);
	   for(ChargeStationPo s:pList){
			s.setTsxxCount(0);
		}
	   return pList;
   }
   
   public ChargeDevPo getChargeDevInfo(String devno,String orgno) throws Exception{
	   Map<String,Object> m = new HashMap<String,Object>();
	   m.put("devno", devno);
	   m.put("orgno", orgno);
	   return chargeDevDao.getChargeDevInfo(m);
   }
   
   public ChargeRecordPo getChargeRecord(String cdczno) throws Exception{
	   ChargeRecordPo record= chargeRecordDao.getChargeRecord(cdczno);
	   return record;
   }
   
   public List<ChargeRecordPo> getChargeRecordList(Map<String,Object> param) throws Exception{
	   List<ChargeRecordPo> record= chargeRecordDao.getChargeRecordList(param);
	   return record;
   }
   
   public List<ChargeStationPo> getWxStationList(Map<String,Object> param) throws Exception{
	   List<ChargeStationPo> record= chargeStationDao.getWxStationList(param);
	   return record;
   }
   
   public List<ChargePlugPo> getChargePlugList(String cdzno) throws Exception{
	   List<ChargePlugPo> record= chargePlugDao.getChargePlugList(cdzno);
	   return record;
   }
   
   public ChargeStationPo getInfoByPlugNo(String plugno) throws Exception{
	   Map<String, Object> m = new HashMap<String, Object>();
       m.put("cdczno", plugno);
	   return chargeStationDao.getInfoByPlugNo(m);
   }
   
   public void insDebugInfo(Map<String,Object> m) throws Exception{
	   chargePlugDao.insDebugInfo(m);
   }
   
   public void insLogInfo(Map<String,Object> m) throws Exception{
	   chargeLogDao.insLogInfo(m);
   }
   
   public void insZfbLogInfo(Map<String,Object> m) throws Exception{
	   chargeLogDao.insZfbLogInfo(m);
   }
   
   public List<Map<String,String>> getPlugDebugList(String subburo) throws Exception{
	   return chargePlugDao.getPlugDebugList(subburo);
   }
   
   public boolean sfmzf(String plugno) throws Exception{
	   ChargePlugPo p = chargePlugDao.sfmzf(plugno);
	   return p != null;
   }
   
   public ChargeDevPo sfygl(String devno) throws Exception{
	   return chargeDevDao.sfygl(devno);
   }
   
	public void insBdxx(BindDevPo bind) throws Exception {
		checkDevDao.insBdxx(bind);
	}

	public List<BindDevPo> getBindDevList(Map<String, Object> m)
			throws Exception {
		return checkDevDao.getBindDevList(m);
	}

	public List<BindDevPo> getBindDevPlugList(Map<String, Object> m)
			throws Exception {
		return checkDevDao.getBindDevPlugList(m);
	}

	public BindDevPo getBindDev(Map<String, Object> m) throws Exception {
		return checkDevDao.getBindDev(m);
	}

	public boolean sfBind(BindDevPo p) throws Exception {
		BindDevPo t = checkDevDao.sfBind(p);
		return t != null;
	}

	public List<ChargeTjPo> getYssj(Map<String, Object> m) throws Exception {
		return chargeTjDao.getYssj(m);
	}

	public Map<String, Object> getChargeDevList(Map<String, Object> m)
			throws Exception {
		Map<String, Object> re = new HashMap<String, Object>();
		List<ChargeDevPo> devList = chargeDevDao.getChargeDevList(m);
		re.put("stid", m.get("id"));
		int czcount = 0;
		int czkxs = 0;
		for (ChargeDevPo dev : devList) {
			int devcz = 0;
			if (re.get("stname") == null) {
				re.put("staddr", dev.getStationAddr());
				re.put("stno", dev.getStationNo());
				re.put("stname", dev.getCdzname());
			}
			int devcount = Integer.parseInt(dev.getPlugCount());
			czcount += devcount;
			List<ChargePlugPo> plugList = getChargePlugList(dev
					.getChargedeviceNo());
			if (plugList != null) {
				dev.setPlugList(plugList);
				for (ChargePlugPo plug : plugList) {
					if ("0".equals(plug.getOpStatus()))
						czkxs++;
					else
						devcz++;
				}

			}
			if (devcz == devcount)
				dev.setDevCzzt("1");
			else
				dev.setDevCzzt("");
		}

		re.put("devDate", devList);
		re.put("czzs", Integer.valueOf(czcount));
		re.put("czkxs", Integer.valueOf(czkxs));
		return re;
	}

	public ChargeStationPo getChargeStationInfo(Map<String, Object> m)
			throws Exception {
		return chargeStationDao.getChargeStationInfo(m);
	}
	
    public ChargeStationPo getLwyhInfo(Map<String, Object> m)
        throws Exception
    {
        return chargeStationDao.getInfoByPlugNo(m);
    }
    
    public List<ChargeStationPo> getZfbMapStationList(Map<String, Object> param)
        throws Exception
    {
        List<ChargeStationPo> record = chargeStationDao.getZfbMapStationList(param);
        return record;
    }
}
