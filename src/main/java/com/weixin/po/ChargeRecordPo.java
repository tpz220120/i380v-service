package com.weixin.po;

public class ChargeRecordPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String recordId;//当前充电记录id
	
	private String chargeplugId;//充电插座标识
	
	private String chargeplugNo;//充电插座编号
	
	private String chargeUserId;//充电用户标识
	
	private String chargeTime;//充电时间
	
	private String chargeMoney;//充电金额
	private String returnMoney;//退费金额
	private String income;//总充电费用
	
	private String chargeOpenTime;//充电开启时间
	
	private String chargeFinishTime;//充电开启时间
	
	private String chargeType;//充电类型
	
	private String chargeTypeName;//充电类型名称
	
    private double unitPrice1;//单价1
	private double unitPrice2;//单价2
	private double unitPrice3;//单价3
	private double unitPrice4;
    private String stepPower1;
    private String stepPower2;
    private String stepPower3;
    private String closingPeriod;
	private double chargeAmount;//充电量
	private double usageAmount;//使用量
	private double surplusAmount;//剩余量
	
	//按时间显示专用
	private String unitPrice1Str;//单价1
	private String unitPrice2Str;//单价2
	private String unitPrice3Str;//单价3
	private String chargeAmountStr;//充电量
	private String usageAmountStr;//使用量
	private String surplusAmountStr;//剩余量
	
	private String minCharge;//最低消费
    
	private String chargeOpenFlag;
	
	private String plugSn;
	
	private String chargeOpenFlagName;//为1表示充电等待中（等待主站回应）为0表示充电开启成功；为负表示充电开启失败；-1表示设备总体已经超过最大功率
	
	private String curPower;//当前功率
	
	private String maxPower;//最大功率
	
	private String avgPower;// 平均功率
	
	private String isReturn;// 是否退费 N代表不退费，Y代表退费
	
	//显示用
	private String cdzname;// 充电站名称
	private String stationAddr;// 充电站地址
	private String chargedeviceNo;// 充电设备编号
	
    private String orderId;
    private String orderStatus;
    private String sftf;
	
	public String getChargeplugId() {
		return chargeplugId;
	}

	public String getPlugSn() {
		return plugSn;
	}

	public void setPlugSn(String plugSn) {
		this.plugSn = plugSn;
	}

	public String getChargeFinishTime() {
		return chargeFinishTime;
	}

	public void setChargeFinishTime(String chargeFinishTime) {
		this.chargeFinishTime = chargeFinishTime;
	}

	public void setChargeplugId(String chargeplugId) {
		this.chargeplugId = chargeplugId;
	}

	public String getChargeplugNo() {
		return chargeplugNo;
	}

	public void setChargeplugNo(String chargeplugNo) {
		this.chargeplugNo = chargeplugNo;
	}

	public String getChargeUserId() {
		return chargeUserId;
	}

	public void setChargeUserId(String chargeUserId) {
		this.chargeUserId = chargeUserId;
	}

	public String getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}

	public String getChargeMoney() {
		return chargeMoney;
	}

	public void setChargeMoney(String chargeMoney) {
		this.chargeMoney = chargeMoney;
	}

	public String getChargeOpenTime() {
		return chargeOpenTime;
	}

	public void setChargeOpenTime(String chargeOpenTime) {
		this.chargeOpenTime = chargeOpenTime;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getChargeTypeName() {
		return chargeTypeName;
	}

	public void setChargeTypeName(String chargeTypeName) {
		this.chargeTypeName = chargeTypeName;
	}


	public String getChargeOpenFlag() {
		return chargeOpenFlag;
	}

	public void setChargeOpenFlag(String chargeOpenFlag) {
		this.chargeOpenFlag = chargeOpenFlag;
	}

	public String getChargeOpenFlagName() {
		return chargeOpenFlagName;
	}

	public void setChargeOpenFlagName(String chargeOpenFlagName) {
		this.chargeOpenFlagName = chargeOpenFlagName;
	}


	public String getCurPower() {
		return curPower;
	}

	public void setCurPower(String curPower) {
		this.curPower = curPower;
	}

	public String getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower;
	}

	public String getAvgPower() {
		return avgPower;
	}

	public void setAvgPower(String avgPower) {
		this.avgPower = avgPower;
	}

	public String getCdzname() {
		return cdzname;
	}

	public void setCdzname(String cdzname) {
		this.cdzname = cdzname;
	}

	public String getStationAddr() {
		return stationAddr;
	}

	public void setStationAddr(String stationAddr) {
		this.stationAddr = stationAddr;
	}

	public String getChargedeviceNo() {
		return chargedeviceNo;
	}

	public void setChargedeviceNo(String chargedeviceNo) {
		this.chargedeviceNo = chargedeviceNo;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getMinCharge() {
		return minCharge;
	}

	public void setMinCharge(String minCharge) {
		this.minCharge = minCharge;
	}

	public double getUnitPrice1() {
		return unitPrice1;
	}

	public void setUnitPrice1(double unitPrice1) {
		this.unitPrice1 = unitPrice1;
	}

	public double getUnitPrice2() {
		return unitPrice2;
	}

	public void setUnitPrice2(double unitPrice2) {
		this.unitPrice2 = unitPrice2;
	}

	public double getUnitPrice3() {
		return unitPrice3;
	}

	public void setUnitPrice3(double unitPrice3) {
		this.unitPrice3 = unitPrice3;
	}

	public double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public double getUsageAmount() {
		return usageAmount;
	}

	public void setUsageAmount(double usageAmount) {
		this.usageAmount = usageAmount;
	}

	public double getSurplusAmount() {
		return surplusAmount;
	}

	public void setSurplusAmount(double surplusAmount) {
		this.surplusAmount = surplusAmount;
	}

	public String getUnitPrice1Str() {
		return unitPrice1Str;
	}

	public void setUnitPrice1Str(String unitPrice1Str) {
		this.unitPrice1Str = unitPrice1Str;
	}

	public String getUnitPrice2Str() {
		return unitPrice2Str;
	}

	public void setUnitPrice2Str(String unitPrice2Str) {
		this.unitPrice2Str = unitPrice2Str;
	}

	public String getUnitPrice3Str() {
		return unitPrice3Str;
	}

	public void setUnitPrice3Str(String unitPrice3Str) {
		this.unitPrice3Str = unitPrice3Str;
	}

	public String getChargeAmountStr() {
		return chargeAmountStr;
	}

	public void setChargeAmountStr(String chargeAmountStr) {
		this.chargeAmountStr = chargeAmountStr;
	}

	public String getUsageAmountStr() {
		return usageAmountStr;
	}

	public void setUsageAmountStr(String usageAmountStr) {
		this.usageAmountStr = usageAmountStr;
	}

	public String getSurplusAmountStr() {
		return surplusAmountStr;
	}

	public void setSurplusAmountStr(String surplusAmountStr) {
		this.surplusAmountStr = surplusAmountStr;
	}

	public String getIsReturn() {
		return isReturn;
	}

	public void setIsReturn(String isReturn) {
		this.isReturn = isReturn;
	}

	public String getReturnMoney() {
		return returnMoney;
	}

	public void setReturnMoney(String returnMoney) {
		this.returnMoney = returnMoney;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public double getUnitPrice4() {
		return unitPrice4;
	}

	public void setUnitPrice4(double unitPrice4) {
		this.unitPrice4 = unitPrice4;
	}

	public String getStepPower1() {
		return stepPower1;
	}

	public void setStepPower1(String stepPower1) {
		this.stepPower1 = stepPower1;
	}

	public String getStepPower2() {
		return stepPower2;
	}

	public void setStepPower2(String stepPower2) {
		this.stepPower2 = stepPower2;
	}

	public String getStepPower3() {
		return stepPower3;
	}

	public void setStepPower3(String stepPower3) {
		this.stepPower3 = stepPower3;
	}

	public String getClosingPeriod() {
		return closingPeriod;
	}

	public void setClosingPeriod(String closingPeriod) {
		this.closingPeriod = closingPeriod;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSftf() {
		return sftf;
	}

	public void setSftf(String sftf) {
		this.sftf = sftf;
	}
}
