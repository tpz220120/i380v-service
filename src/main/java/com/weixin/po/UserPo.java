package com.weixin.po;

public class UserPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user_id;//用户id
	
	private String user_no;//用户名
	
	private String user_name;//名称
	
	private String user_password;//密码
	
	private String user_org_no;//用户单位
	
	private String user_org_name;//用户单位名称
	
	private String user_dept_no;//部门
	
	private String user_dept_name;//部门名称
	
	private String user_mobile;//用户手机号
	
	private String fac;
    private String txgylx;
    private String txgybb;
    private String sbxh;
    private String sbxhlist;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_org_no() {
		return user_org_no;
	}

	public void setUser_org_no(String user_org_no) {
		this.user_org_no = user_org_no;
	}

	public String getUser_org_name() {
		return user_org_name;
	}

	public void setUser_org_name(String user_org_name) {
		this.user_org_name = user_org_name;
	}

	public String getUser_dept_no() {
		return user_dept_no;
	}

	public void setUser_dept_no(String user_dept_no) {
		this.user_dept_no = user_dept_no;
	}

	public String getUser_dept_name() {
		return user_dept_name;
	}

	public void setUser_dept_name(String user_dept_name) {
		this.user_dept_name = user_dept_name;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getFac() {
		return fac;
	}

	public void setFac(String fac) {
		this.fac = fac;
	}

	public String getTxgylx() {
		return txgylx;
	}

	public void setTxgylx(String txgylx) {
		this.txgylx = txgylx;
	}

	public String getTxgybb() {
		return txgybb;
	}

	public void setTxgybb(String txgybb) {
		this.txgybb = txgybb;
	}

	public String getSbxh() {
		return sbxh;
	}

	public void setSbxh(String sbxh) {
		this.sbxh = sbxh;
	}

	public String getSbxhlist() {
		return sbxhlist;
	}

	public void setSbxhlist(String sbxhlist) {
		this.sbxhlist = sbxhlist;
	}
}
