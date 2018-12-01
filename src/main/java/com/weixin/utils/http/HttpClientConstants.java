package com.weixin.utils.http;

public class HttpClientConstants {
	
	public static final String UTF_8 = "UTF-8";
	
	public static final String headerName_content_type = "Content-Type";
	
	public static final String headerValue_form = "application/x-www-form-urlencoded; charset=utf-8";
	public static final String headerValue_form_template = "application/x-www-form-urlencoded; charset=%s";
	public static final String headerValue_xml_template = "application/soap+xml; charset=%s";
	
	public static final int socketTimeout = 30000;
	public static final int connectTimeout = 30000;
	
}
