package com.weixin.config;

import java.util.HashMap;
import java.util.Map;

public class EbikeChargeConfig {
	// 支付类型
	public static final Map<String, String> ZfTypeMap;
	static {
		ZfTypeMap = new HashMap<String, String>();
		ZfTypeMap.put("WXPAY","WXPAY");//微信支付
		ZfTypeMap.put("ALIPAY","ALIPAY");//微信支付
		ZfTypeMap.put("ACCOUNT","INNERACCT");//内部账户支付
		ZfTypeMap.put("REDPKT","EBMKT");//红包账户
	}
	
	// 支付通道编号
	public static final Map<String, String> PayChannelNoMap;
	static {
		PayChannelNoMap = new HashMap<String, String>();
		PayChannelNoMap.put("WXPAY","WXPAY_OA_EBIKE");//微信公众号支付（驿吧）
		PayChannelNoMap.put("ALIPAY","ALIPAY_APPLET_EBIKE");//支付宝小程序（驿吧）
		PayChannelNoMap.put("REDPKT","EBMKT_REDPKT");//驿吧营销活动红包支付
		PayChannelNoMap.put("OFFLINE_BANK","OFFLINE_BANK_EBIKE");//线下银行转帐（驿吧）
		PayChannelNoMap.put("OFFLINE_CASH","OFFLINE_CASH_EBIKE");//线下现金支付（驿吧）
		PayChannelNoMap.put("WXXCXPAY","WXPAY_APPLET_EBIKE");// 微信小程序支付（驿吧）
	}
}
