package com.weixin.po;

public class WorkOrderDetailPo extends BasePo
{
  private static final long serialVersionUID = 1L;
  private String csworkorderId;
  private String handleSn;
  private String handleNode;
  private String nodeSubburo;
  private String handler;
  private String handleTime;
  private String handleDesc;
  private String handleAttach;

  public String getCsworkorderId()
  {
    return this.csworkorderId;
  }

  public void setCsworkorderId(String csworkorderId) {
    this.csworkorderId = csworkorderId;
  }

  public String getHandleSn() {
    return this.handleSn;
  }

  public void setHandleSn(String handleSn) {
    this.handleSn = handleSn;
  }

  public String getHandleNode() {
    return this.handleNode;
  }

  public void setHandleNode(String handleNode) {
    this.handleNode = handleNode;
  }

  public String getNodeSubburo() {
    return this.nodeSubburo;
  }

  public void setNodeSubburo(String nodeSubburo) {
    this.nodeSubburo = nodeSubburo;
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