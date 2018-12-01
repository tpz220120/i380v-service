package com.weixin.dto;

public class WechatXcxDto
{
  private String session_key;
  private String open_id;
  private String unionid;

  public WechatXcxDto(String session_key, String open_id, String unionid)
  {
    this.session_key = session_key;
    this.open_id = open_id;
    this.unionid = unionid;
  }

  public String getSession_key() {
    return this.session_key;
  }

  public void setSession_key(String session_key) {
    this.session_key = session_key;
  }

  public String getOpen_id() {
    return this.open_id;
  }

  public void setOpen_id(String open_id) {
    this.open_id = open_id;
  }

  public String getUnionid() {
    return this.unionid;
  }

  public void setUnionid(String unionid) {
    this.unionid = unionid;
  }
}