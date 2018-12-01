package com.weixin.config;

public class I380VConfig {
	// 个人账户类型--（一般针对充值）
	public static final String dubboUserType = "bike_user";
	
	// 公司账户类型--（一般给缴费给某个售电公司）
	public static final String dubboOrgType = "platform_org";
	
	public static final String business_type = "i380v-bike";
	
	// 充电自行车费用余额扣付
	public static final String business_type_yezf = "bike_yezf";
	
	// 虚拟充值
	public static final String business_type_xncz = "bike_xncz";
	
    public static final String dubboZfbUserType = "zfb_bike_user";
    public static final String platOrgNo = "10000000";
    public static final String dubboPlatType = "ebike_transit";
    public static final String aliFlag = "alipay_";
    
    public static final String business_type_cz = "ebike-charge-cz";
    
    
    // 成功失败标识，订单返回结果时候用
    public static final String tradeSuccess= "SUCCESS";
    public static final String tradeFail= "FAILURE";
}
