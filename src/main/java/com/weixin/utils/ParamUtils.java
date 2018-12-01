package com.weixin.utils;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class ParamUtils {
	
	public static String buildParams(Map<String,String> params){
		
		StringBuffer sb = new StringBuffer();
		Iterator it = params.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			
			if(sb.length() == 0 && !StringUtils.isEmpty(v)){
				sb.append(k + "=" + v);
			}
			else if(sb.length() > 0 && !StringUtils.isEmpty(v)){
				sb.append("&" + k + "=" + v);
			}	
		}
		return sb.toString();
	}
	
}
