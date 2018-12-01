package com.weixin.po;

/**
 * 红包账户信息
 * 
 * @author tupz
 * 
 */
public class RedPktAccountPo extends BasePo {
	private static final long serialVersionUID = 1L;
	private String charge_user_id;// 充电用户标识
	private double redpkt_balance;// 红包余额
	public String getCharge_user_id() {
		return charge_user_id;
	}
	public void setCharge_user_id(String charge_user_id) {
		this.charge_user_id = charge_user_id;
	}
	public double getRedpkt_balance() {
		return redpkt_balance;
	}
	public void setRedpkt_balance(double redpkt_balance) {
		this.redpkt_balance = redpkt_balance;
	}
}