package com.weixin.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WechatServletContextDto {
	
	private String access_token;
	
	private String jsapi_ticket;
	
	private long expirationTime; // 当前生成时间加上token令牌的有效时间（微信默认7200秒）

	public WechatServletContextDto(String access_token, String jsapi_ticket,long expirationTime) {
		super();
		System.out.println("生成token的时间点为：" + new Date());
		this.access_token = access_token;
		this.jsapi_ticket = jsapi_ticket;
		this.expirationTime = expirationTime;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getJsapi_ticket() {
		return jsapi_ticket;
	}

	public void setJsapi_ticket(String jsapi_ticket) {
		this.jsapi_ticket = jsapi_ticket;
	}
	
	public long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}

	public boolean isNeedRefresh(){
		boolean sfsxToken = System.currentTimeMillis() > expirationTime;
		
		if(sfsxToken){
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
			Date date = new Date(expirationTime);
			System.out.println("存储在内存中的微信刷新时间为：" + formatter.format(date));
			
			System.out.println("刷新微信token的时间点为：" + formatter.format(new Date()));
		}
		
		return sfsxToken;
	}
}
