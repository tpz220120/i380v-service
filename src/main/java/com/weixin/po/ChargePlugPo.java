package com.weixin.po;

public class ChargePlugPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String chargeplugId;//充电插座唯一性标识
	
	private String chargedeviceId;//所属充电设备标识
	
	private String chargeplugNo;//充电插座编号--二维码上的编号
	
	private String plugSn;//插座序号
	
	private String plugId;//插座通讯标识
	
	private String opStatus;//充电插座状态 0 - 空闲 1 - 正在使用 2 - 已被预订；9 – 不可用（设备离线）；
	
	private String subburo;//充电插座所属单位，微信支付时作为账户收款方用

	public String getChargeplugId() {
		return chargeplugId;
	}

	public void setChargeplugId(String chargeplugId) {
		this.chargeplugId = chargeplugId;
	}

	public String getChargedeviceId() {
		return chargedeviceId;
	}

	public void setChargedeviceId(String chargedeviceId) {
		this.chargedeviceId = chargedeviceId;
	}

	public String getChargeplugNo() {
		return chargeplugNo;
	}

	public void setChargeplugNo(String chargeplugNo) {
		this.chargeplugNo = chargeplugNo;
	}

	public String getPlugSn() {
		return plugSn;
	}

	public void setPlugSn(String plugSn) {
		this.plugSn = plugSn;
	}

	public String getPlugId() {
		return plugId;
	}

	public void setPlugId(String plugId) {
		this.plugId = plugId;
	}

	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public String getSubburo() {
		return subburo;
	}

	public void setSubburo(String subburo) {
		this.subburo = subburo;
	}
}
