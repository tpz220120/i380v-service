package com.weixin.po;

public class AlarmDetailPo extends BasePo
{
  private static final long serialVersionUID = 1L;
  private String opsworkorderId;
  private String handleSn;
  private String handler;
  private String handleTime;
  private String handleDesc;
  private String handleAttach;

  public String getOpsworkorderId()
  {
    return this.opsworkorderId;
  }

  public void setOpsworkorderId(String opsworkorderId) {
    this.opsworkorderId = opsworkorderId;
  }

  public String getHandleSn() {
    return this.handleSn;
  }

  public void setHandleSn(String handleSn) {
    this.handleSn = handleSn;
  }

  public String getHandler() {
    return this.handler;
  }

  public void setHandler(String handler) {
    this.handler = handler;
  }

  public String getHandleTime() {
    return this.handleTime;
  }

  public void setHandleTime(String handleTime) {
    this.handleTime = handleTime;
  }

  public String getHandleDesc() {
    return this.handleDesc;
  }

  public void setHandleDesc(String handleDesc) {
    this.handleDesc = handleDesc;
  }

  public String getHandleAttach() {
    return this.handleAttach;
  }

  public void setHandleAttach(String handleAttach) {
    this.handleAttach = handleAttach;
  }
}