package com.weixin.po;

/**
 * 平台营销活动po
 * 
 * @author tupz
 * 
 */
public class CmpnPo extends BasePo {
	private static final long serialVersionUID = 1L;
	private String cmpn_id;// 营销活动标识
	private String cmpn_no;// 营销活动编号
	private String cmpn_type;// 营销活动类型
	private String cmpn_status;// 营销活动状态
	private String cmpn_name;// 营销活动名称
	private String cmpn_startdate;// 营销活动开始日期
	private String cmpn_enddate;// 营销活动结束日期
	private String cmpn_part_limit;// 参与次数限制
	private String valid;// 是否有效
	private String create_time_format;// 创建时间格式化过
	private String end_time;// 红包有效时间格式化过
	
	private int kcycs;// 红包可参与次数
	private int ycycs;// 红包剩余次数

	private String recharge_money;// 充值金额
	private String presend_redpkt_money;// 赠送红包金额

	public String getCmpn_id() {
		return cmpn_id;
	}

	public void setCmpn_id(String cmpn_id) {
		this.cmpn_id = cmpn_id;
	}

	public String getCmpn_no() {
		return cmpn_no;
	}

	public void setCmpn_no(String cmpn_no) {
		this.cmpn_no = cmpn_no;
	}

	public String getCmpn_type() {
		return cmpn_type;
	}

	public void setCmpn_type(String cmpn_type) {
		this.cmpn_type = cmpn_type;
	}

	public String getCmpn_status() {
		return cmpn_status;
	}

	public void setCmpn_status(String cmpn_status) {
		this.cmpn_status = cmpn_status;
	}

	public String getCmpn_name() {
		return cmpn_name;
	}

	public void setCmpn_name(String cmpn_name) {
		this.cmpn_name = cmpn_name;
	}

	public String getCmpn_startdate() {
		return cmpn_startdate;
	}

	public void setCmpn_startdate(String cmpn_startdate) {
		this.cmpn_startdate = cmpn_startdate;
	}

	public String getCmpn_enddate() {
		return cmpn_enddate;
	}

	public void setCmpn_enddate(String cmpn_enddate) {
		this.cmpn_enddate = cmpn_enddate;
	}

	public String getCmpn_part_limit() {
		return cmpn_part_limit;
	}

	public void setCmpn_part_limit(String cmpn_part_limit) {
		this.cmpn_part_limit = cmpn_part_limit;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getCreate_time_format() {
		return create_time_format;
	}

	public void setCreate_time_format(String create_time_format) {
		this.create_time_format = create_time_format;
	}

	public String getRecharge_money() {
		return recharge_money;
	}

	public void setRecharge_money(String recharge_money) {
		this.recharge_money = recharge_money;
	}

	public String getPresend_redpkt_money() {
		return presend_redpkt_money;
	}

	public void setPresend_redpkt_money(String presend_redpkt_money) {
		this.presend_redpkt_money = presend_redpkt_money;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public int getKcycs() {
		return kcycs;
	}

	public void setKcycs(int kcycs) {
		this.kcycs = kcycs;
	}

	public int getYcycs() {
		return ycycs;
	}

	public void setYcycs(int ycycs) {
		this.ycycs = ycycs;
	}
}