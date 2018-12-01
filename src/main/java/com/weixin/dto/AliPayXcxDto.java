package com.weixin.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AliPayXcxDto
{
  private String user_id;
  private String access_token;
  private String expires_in;
  private String refresh_token;
  private String re_expires_in;
  private long expirationTime;

  public AliPayXcxDto(String user_id, String access_token, String refresh_token, long expirationTime)
  {
    System.out.println("生成token的时间点为：" + new Date());
    this.access_token = access_token;
    this.user_id = user_id;
    this.refresh_token = refresh_token;
    this.expirationTime = expirationTime;
  }

  public String getUser_id() {
    return this.user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getAccess_token() {
    return this.access_token;
  }

  public void setAccess_token(String access_token) {
    this.access_token = access_token;
  }

  public String getExpires_in() {
    return this.expires_in;
  }

  public void setExpires_in(String expires_in) {
    this.expires_in = expires_in;
  }

  public String getRefresh_token() {
    return this.refresh_token;
  }

  public void setRefresh_token(String refresh_token) {
    this.refresh_token = refresh_token;
  }

  public String getRe_expires_in() {
    return this.re_expires_in;
  }

  public void setRe_expires_in(String re_expires_in) {
    this.re_expires_in = re_expires_in;
  }

  public long getExpirationTime() {
    return this.expirationTime;
  }

  public void setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
  }

  public boolean isNeedRefresh() {
    boolean sfsxToken = System.currentTimeMillis() > this.expirationTime;

    if (sfsxToken) {
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
      System.out.println("刷新微信token的时间点为：" + formatter.format(new Date()));
      Date date = new Date(this.expirationTime);
      System.out.println("存储在内存中的微信刷新时间为：" + formatter.format(date));
    }

    return sfsxToken;
  }
}