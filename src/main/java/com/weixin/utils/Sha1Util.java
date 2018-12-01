package com.weixin.utils;

import java.security.MessageDigest;

public class Sha1Util {

	public static String getSha1(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}

		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(str.getBytes());

			byte[] md = mdTemp.digest();
			int j = md.length;
			char buf[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static void main(String args[]){
		
		String str = "jsapi_ticket=sM4AOVdWfPE4DxkXGEs8VM-Rhf7BMAVId0wjUmpMmZVArCWQ9WfSV_1uV74HM6hHmOftBmh7u1UHySpkHpCZ3g&noncestr=CRN8LZLIXK&timestamp=1444564279&url=http://www.yiyn.com.cn/weixin-web/pay/confirmPay.do";
		System.out.println(Sha1Util.getSha1(str));
		
	}

}
