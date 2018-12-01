package com.weixin.po;

/**
 * 平台营销活动参加用户po
 * 
 * @author tupz
 * 
 */
public class CmpnUserPo extends BasePo {
	private static final long serialVersionUID = 1L;
	private String partrecord_id;//参与记录标识
	private String charge_user_id;//充电用户标识
	private String cmpn_id;// 营销活动标识
	private String part_time;// 参与时间
	private String recharge_money;// 充值金额
	
	private String recharge_order_id;// 充值订单标识(由充电到账通知到后填写)
//	0 – 等待充值（初始）；
//	-1 – 充值失败；
//	1 – 充值成功；
//	9 – 充值超时；
	private String recharge_status;// 充值状态  (由充电到账通知到后填写)
	
	private String presend_redpkt_money;// 赠送红包金额
	private String presend_redpkt_time;// 赠送红包时间
	public String getPartrecord_id() {
		return partrecord_id;
	}
	public void setPartrecord_id(String partrecord_id) {
		this.partrecord_id = partrecord_id;
	}
	public String getCharge_user_id() {
		return charge_user_id;
	}
	public void setCharge_user_id(String charge_user_id) {
		this.charge_user_id = charge_user_id;
	}
	public String getCmpn_id() {
		return cmpn_id;
	}
	public void setCmpn_id(String cmpn_id) {
		this.cmpn_id = cmpn_id;
	}
	public String getPart_time() {
		return part_time;
	}
	public void setPart_time(String part_time) {
		this.part_time = part_time;
	}
	public String getRecharge_money() {
		return recharge_money;
	}
	public void setRecharge_money(String recharge_money) {
		this.recharge_money = recharge_money;
	}
	public String getRecharge_order_id() {
		return recharge_order_id;
	}
	public void setRecharge_order_id(String recharge_order_id) {
		this.recharge_order_id = recharge_order_id;
	}
	public String getRecharge_status() {
		return recharge_status;
	}
	public void setRecharge_status(String recharge_status) {
		this.recharge_status = recharge_status;
	}
	public String getPresend_redpkt_money() {
		return presend_redpkt_money;
	}
	public void setPresend_redpkt_money(String presend_redpkt_money) {
		this.presend_redpkt_money = presend_redpkt_money;
	}
	public String getPresend_redpkt_time() {
		return presend_redpkt_time;
	}
	public void setPresend_redpkt_time(String presend_redpkt_time) {
		this.presend_redpkt_time = presend_redpkt_time;
	}
}