package com.weixin.dto;

import java.util.SortedMap;
import java.util.TreeMap;

import com.weixin.config.WeixinConfig;
import com.weixin.utils.ParamUtils;
import com.weixin.utils.Sha1Util;

/**
 * 所有需要使用JS-SDK的页面必须先注入配置信息
 * 
 * @author Administrator
 *
 */
public class WechatConfigDto extends WechatBaseDto{
	
	public WechatConfigDto(WeixinConfig config) {
		super(config);
	}

	private String jsapi_ticket;
	
	//private String appId;
	
	private String timeStamp;
	
	private String nonceStr;
	
	private String url;
	
	private String signature;

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getJsapi_ticket() {
		return jsapi_ticket;
	}

	public void setJsapi_ticket(String jsapi_ticket) {
		this.jsapi_ticket = jsapi_ticket;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String createSign(){
		SortedMap<String, String> packageParams = new TreeMap<String, String>();
		//packageParams.put("appId", appId);  
		packageParams.put("jsapi_ticket", jsapi_ticket);
		packageParams.put("timestamp", timeStamp);  
		packageParams.put("noncestr", nonceStr);
		packageParams.put("url", url);
		
		String param_str = ParamUtils.buildParams(packageParams);
		//sb.append("key=" + WeixinConfig.security_key);
		System.out.println("WechatConfigDto sha1 sb:" + param_str);
		//String sign = MD5Util.MD5Encode(param_str, "utf-8").toUpperCase();
		String sign = Sha1Util.getSha1(param_str);
		System.out.println("WechatConfigDto sign:" + sign);
		return sign;
	}
	
}
