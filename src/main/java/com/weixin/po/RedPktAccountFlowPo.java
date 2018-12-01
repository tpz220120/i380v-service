package com.weixin.po;

/**
 * 红包账户流水信息
 * 
 * @author tupz
 * 
 */
public class RedPktAccountFlowPo extends BasePo {
	private static final long serialVersionUID = 1L;
	private String journal_id;// 流水标识
	private String charge_user_id;// 充电用户标识
	private String journal_money;//流水金额
	private String journal_dir;// 0 – 流出；1 – 流入；
//	1 – 红包支付；
//	2 – 红包退款；
//	3 – 红包赠送；
//	4 – 红包失效；
	private String journal_type;// 流水类型
//	ebike_charge_order – 驿吧充电订单；
//	ebmkt_cmpn_recharge – 驿吧平台充值送红包活动；
	private String business_module;// 业务模块
	private String business_id;// 业务标识
	private String journal_remark;// 流水备注
	
	private String hbType;// 红包类型，页面显示用
	
	private String c_time_format;//流水创建时间
	public String getJournal_id() {
		return journal_id;
	}
	public void setJournal_id(String journal_id) {
		this.journal_id = journal_id;
	}
	public String getCharge_user_id() {
		return charge_user_id;
	}
	public void setCharge_user_id(String charge_user_id) {
		this.charge_user_id = charge_user_id;
	}
	public String getJournal_money() {
		return journal_money;
	}
	public void setJournal_money(String journal_money) {
		this.journal_money = journal_money;
	}
	public String getJournal_dir() {
		return journal_dir;
	}
	public void setJournal_dir(String journal_dir) {
		this.journal_dir = journal_dir;
	}
	public String getJournal_type() {
		return journal_type;
	}
	public void setJournal_type(String journal_type) {
		this.journal_type = journal_type;
	}
	public String getBusiness_module() {
		return business_module;
	}
	public void setBusiness_module(String business_module) {
		this.business_module = business_module;
	}
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public String getJournal_remark() {
		return journal_remark;
	}
	public void setJournal_remark(String journal_remark) {
		this.journal_remark = journal_remark;
	}
	public String getHbType() {
		return hbType;
	}
	public void setHbType(String hbType) {
		this.hbType = hbType;
	}
	public String getC_time_format() {
		return c_time_format;
	}
	public void setC_time_format(String c_time_format) {
		this.c_time_format = c_time_format;
	}
}