package com.weixin.service.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.i380v.MainDao;

@Service
public class MainService {
   @Autowired
   private MainDao mainDao;
   
   public List<Map<String,Object>> getDqcdjl() throws Exception{
	   return mainDao.getDqcdjl();
   }
   
   public List<Map<String,String>> getDqcdjl2() throws Exception{
	   return mainDao.getDqcdjl2();
   }
   
   public Map<String,Object> getZs() throws Exception{
	   return mainDao.getZs();
   }
   
   public List<Map<String,String>> getDqcdzList() throws Exception{
	   return mainDao.getDqcdzList();
   }
   
   public Map<String,String> getQgCdzb() throws Exception{
	   Map<String,String> re = new HashMap<String,String>();
	   List<Map<String,String>> zblist = mainDao.getQgCdzb();
	   
	   if(zblist.size() !=0){
		   for(Map<String,String> zb:zblist){
			   re.put(zb.get("code"),zb.get("zbz"));
		   }
	   }
	   return re;
   }
   
   public List<Map<String,String>> getSsCdzb() throws Exception{
	   List<Map<String,String>> reList = new ArrayList<Map<String,String>>();
	   List<Map<String,String>> zblist = mainDao.getSsCdzb();
	   
	   if(zblist.size() !=0){
		   for(Map<String,String> zb:zblist){
			   String adcode = zb.get("adcode");
			   
			   int i =0;
			   for(Map<String,String> re:reList){
				   if(adcode.equals(re.get("adcode"))){
					   re.put(zb.get("code"), zb.get("zbz"));
					   i++;
				   }
			   }
			   
			   if(i == 0){
				   Map<String,String> m = new HashMap<String,String>();
				   m.put("name", zb.get("adname"));
				   m.put("adcode", zb.get("adcode"));
				   m.put(zb.get("code"), zb.get("zbz"));
				   reList.add(m);
			   }
		   }
	   }
	   return reList;
   }
}
