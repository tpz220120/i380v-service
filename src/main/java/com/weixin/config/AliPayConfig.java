package com.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AliPayConfig
{

  @Value("#{configProperties['alixcx.appId']}")
  public String appId;

  @Value("#{configProperties['alixcx.public_key']}")
  public String public_key;

  @Value("#{configProperties['alixcx.private_key']}")
  public String private_key;

  public AliPayConfig()
  {
    this.appId = "";

    this.public_key = "";

    this.private_key = "";
  }

  public String getAppId() {
    return this.appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getPublic_key() {
    return this.public_key;
  }

  public void setPublic_key(String public_key) {
    this.public_key = public_key;
  }

  public String getPrivate_key() {
    return this.private_key;
  }

  public void setPrivate_key(String private_key) {
    this.private_key = private_key;
  }
}