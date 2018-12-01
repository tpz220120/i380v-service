package com.weixin.dto;

/**
 * 微网站授权之后，获得的公共值，保存起来
 * 
 * @author Administrator
 *
 */
public class WechatUserInfoDto {
	
	private String access_token;
	private String openid;
	
	//private String token;
	//private int expires_in;
	
	//private String jsapi_ticket;
	
	private String userimg;
	
	private String nickname;
	
	private String subscribe;//用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。为1时则关注
	
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getUserimg() {
		return userimg;
	}
	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public WechatUserInfoDto(String access_token, String openid){
		super();
		this.access_token = access_token;
		this.openid = openid;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
}
