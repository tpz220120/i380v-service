package com.weixin.po;

public class SmsPo extends BasePo
{
  private static final long serialVersionUID = 1L;
  private String mobile;
  private String operation_type;
  private String identify_code;
  private String status;

  public String getMobile()
  {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getOperation_type() {
    return this.operation_type;
  }

  public void setOperation_type(String operation_type) {
    this.operation_type = operation_type;
  }

  public String getIdentify_code() {
    return this.identify_code;
  }

  public void setIdentify_code(String identify_code) {
    this.identify_code = identify_code;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}