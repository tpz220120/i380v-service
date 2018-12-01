package com.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeixinConfig
{

  @Value("#{configProperties['wechat.appId']}")
  public String appId;

  @Value("#{configProperties['wechat.appsecret']}")
  public String appsecret;

  @Value("#{configProperties['wechat.security_key']}")
  public String security_key;

  @Value("#{configProperties['wechat.mch_id']}")
  public String mch_id;

  public WeixinConfig()
  {
    this.appId = "";

    this.appsecret = "";

    this.security_key = "";

    this.mch_id = "";
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppsecret() {
    return this.appsecret;
  }

  public void setAppsecret(String appsecret) {
    this.appsecret = appsecret;
  }

  public String getSecurity_key() {
    return this.security_key;
  }

  public void setSecurity_key(String security_key) {
    this.security_key = security_key;
  }

  public String getMch_id() {
    return this.mch_id;
  }

  public void setMch_id(String mch_id) {
    this.mch_id = mch_id;
  }
}