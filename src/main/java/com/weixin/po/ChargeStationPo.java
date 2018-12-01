package com.weixin.po;

import java.util.List;
import java.util.Map;

public class ChargeStationPo extends BasePo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subburo;//
	
	private String id;//记录唯一标识
	
	private String name;//名称
	
	private String cdzno;//充电桩编号
	
	private String stationNo;//充电站编号
	
	private String stationAddr;//充电站地址
	
	private String region;//地区
	
	private String longitude;//经度
	
	private String latitude;//纬度
	
	private String opStatus;//充电设备的当前工况状态 1 - 在线  0 - 离线
	
	private String plugCount;//插座数
	
	private String kxnum;//插座空闲数
	
	private String distance;//如果有经纬度定位，则算出距离
	
	private String showjl;//是否显示距离
	
	private String chargeDevNo;//设备编码
	
	//充电站的计费模板信息
	private String chargeType;//充电类型
	private String chargeTypeName;//充电类型名称
	private String unitPrice1;//单价1
	private String unitPrice2;//单价2
	private String unitPrice3;//单价3
	private String unitPrice4;
    private String stepPower1;
    private String stepPower2;
    private String stepPower3;
    private String closingPeriod;
	private String minCharge;//最低消费
	
	private String isReturn;//是否退费
	
	//首页调试信息
	private List<Map<String,String>> tsxx;
	private int tsxxCount;
   
	public int getTsxxCount() {
		return tsxxCount;
	}

	public void setTsxxCount(int tsxxCount) {
		this.tsxxCount = tsxxCount;
	}

	public List<Map<String, String>> getTsxx() {
		return tsxx;
	}

	public void setTsxx(List<Map<String, String>> tsxx) {
		this.tsxx = tsxx;
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

	public String getUnitPrice1() {
		return unitPrice1;
	}

	public void setUnitPrice1(String unitPrice1) {
		this.unitPrice1 = unitPrice1;
	}

	public String getUnitPrice2() {
		return unitPrice2;
	}

	public void setUnitPrice2(String unitPrice2) {
		this.unitPrice2 = unitPrice2;
	}

	public String getUnitPrice3() {
		return unitPrice3;
	}

	public void setUnitPrice3(String unitPrice3) {
		this.unitPrice3 = unitPrice3;
	}

	public String getMinCharge() {
		return minCharge;
	}

	public void setMinCharge(String minCharge) {
		this.minCharge = minCharge;
	}

	public String getChargeDevNo() {
		return chargeDevNo;
	}

	public void setChargeDevNo(String chargeDevNo) {
		this.chargeDevNo = chargeDevNo;
	}

	public String getKxnum() {
		return kxnum;
	}

	public void setKxnum(String kxnum) {
		this.kxnum = kxnum;
	}

	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public String getCdzno() {
		return cdzno;
	}

	public void setCdzno(String cdzno) {
		this.cdzno = cdzno;
	}

	public String getSubburo() {
		return subburo;
	}

	public void setSubburo(String subburo) {
		this.subburo = subburo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStationNo() {
		return stationNo;
	}

	public String getShowjl() {
		return showjl;
	}

	public void setShowjl(String showjl) {
		this.showjl = showjl;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlugCount() {
		return plugCount;
	}

	public void setPlugCount(String plugCount) {
		this.plugCount = plugCount;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getIsReturn() {
		return isReturn;
	}

	public void setIsReturn(String isReturn) {
		this.isReturn = isReturn;
	}

	public String getUnitPrice4() {
		return unitPrice4;
	}

	public void setUnitPrice4(String unitPrice4) {
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
}
