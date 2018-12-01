package com.weixin.po;

/**
 * 充值用户信息--电动自行车ebike.ebike_chargeuser
 * @author tupz
 *
 */
public class BikeUserPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String chargeUserId;//UUID
	
	private String chargeUserNo;//如为“微信用户“，则充电用户名为微信标识；如为“卡用户“，则充电用户名为卡号；

	private String chargeUserType;//10 – 微信用户；20 – 卡用户；
	
	private String chargeUserToken;//微信访问js接口需要有的网页授权token
	
	private String chargeUserName;//用户名称
	
	private String chargeUserPasswd;//密码
	
	private String chargeUserMobile;//用户单位手机
	
	private String valid;//T – 是（TRUE）；F – 否（FALSE）；
	
	private String regTime;//注册时间
	
	private String effTime;//生效时间
	
    private String merchantNo;
    private String unionId;
    
	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getChargeUserId() {
		return chargeUserId;
	}

	public void setChargeUserId(String chargeUserId) {
		this.chargeUserId = chargeUserId;
	}

	public String getChargeUserNo() {
		return chargeUserNo;
	}

	public void setChargeUserNo(String chargeUserNo) {
		this.chargeUserNo = chargeUserNo;
	}

	public String getChargeUserType() {
		return chargeUserType;
	}

	public void setChargeUserType(String chargeUserType) {
		this.chargeUserType = chargeUserType;
	}

	public String getChargeUserName() {
		return chargeUserName;
	}

	public void setChargeUserName(String chargeUserName) {
		this.chargeUserName = chargeUserName;
	}

	public String getChargeUserPasswd() {
		return chargeUserPasswd;
	}

	public void setChargeUserPasswd(String chargeUserPasswd) {
		this.chargeUserPasswd = chargeUserPasswd;
	}

	public String getChargeUserMobile() {
		return chargeUserMobile;
	}

	public void setChargeUserMobile(String chargeUserMobile) {
		this.chargeUserMobile = chargeUserMobile;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getEffTime() {
		return effTime;
	}

	public void setEffTime(String effTime) {
		this.effTime = effTime;
	}

	public String getChargeUserToken() {
		return chargeUserToken;
	}

	public void setChargeUserToken(String chargeUserToken) {
		this.chargeUserToken = chargeUserToken;
	}
}
