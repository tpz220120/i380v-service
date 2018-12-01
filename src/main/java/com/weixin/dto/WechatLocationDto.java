package com.weixin.dto;

/**
 * 微网站授权之后，获得的位置信息，保存起来
 * 
 * @author Administrator
 *
 */
public class WechatLocationDto {
	private String longitude;
	private String latitude;
	
	public WechatLocationDto(String longitude, String latitude){
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
