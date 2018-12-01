package com.weixin.po;

import java.util.List;

public class ChargeDevPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String buro;//子单位
	
	private String subburo;//子单位
	
	private String chargedeviceId;//充电设备id
	
	private String chargedeviceNo;//充电设备编号--二维码上的编号
	
	private String modelNo;//充电型号规格
	
	private String deviceId;//充电设备的本身id 
	
	private String protocolType;//规约类型
	
	private String protocolVersion;//规约版本
	
	private String plugCount;//充电插座个数
	
	private String opStatus;//充电设备的当前运行状态
	
	private String chargestationId;//充电站id
	private String stationNo;//充电站地址
	private String cdzname;//充电站名称
	private String stationAddr;//充电站编号
	private String status;//临时资产表状态
	
    private String devCzzt;
    private List plugList;
    
	public String getDevCzzt() {
		return devCzzt;
	}

	public void setDevCzzt(String devCzzt) {
		this.devCzzt = devCzzt;
	}

	public List getPlugList() {
		return plugList;
	}

	public void setPlugList(List plugList) {
		this.plugList = plugList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public String getCdzname() {
		return cdzname;
	}

	public void setCdzname(String cdzname) {
		this.cdzname = cdzname;
	}

	public String getBuro() {
		return buro;
	}

	public void setBuro(String buro) {
		this.buro = buro;
	}

	public String getSubburo() {
		return subburo;
	}

	public void setSubburo(String subburo) {
		this.subburo = subburo;
	}

	public String getChargedeviceId() {
		return chargedeviceId;
	}

	public void setChargedeviceId(String chargedeviceId) {
		this.chargedeviceId = chargedeviceId;
	}

	public String getChargedeviceNo() {
		return chargedeviceNo;
	}

	public void setChargedeviceNo(String chargedeviceNo) {
		this.chargedeviceNo = chargedeviceNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getProtocolType() {
		return protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public String getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public String getPlugCount() {
		return plugCount;
	}

	public void setPlugCount(String plugCount) {
		this.plugCount = plugCount;
	}

	public String getChargestationId() {
		return chargestationId;
	}

	public void setChargestationId(String chargestationId) {
		this.chargestationId = chargestationId;
	}

	public String getStationNo() {
		return stationNo;
	}

	public void setStationNo(String stationNo) {
		this.stationNo = stationNo;
	}

	public String getStationAddr() {
		return stationAddr;
	}

	public void setStationAddr(String stationAddr) {
		this.stationAddr = stationAddr;
	}
}
