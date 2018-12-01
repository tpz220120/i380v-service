package com.weixin.utils.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientGetUtils {
	
	public static CloseableHttpClient initHttpClient() {
		return HttpClientBuilder.create().build();
	}
	
	/**
	 * Send and get response from the specified url
	 * 
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static HttpResponse getHttpGetResponse(String url) throws Exception{
		HttpGet hg = new HttpGet(url);
		RequestConfig requestConfig = RequestConfig.custom()
				.setSocketTimeout(HttpClientConstants.socketTimeout)
				.setConnectTimeout(HttpClientConstants.connectTimeout).build();// 设置请求和传输超时时�?
		hg.setConfig(requestConfig);
		hg.setHeader(HttpClientConstants.headerName_content_type, HttpClientConstants.headerValue_form);

		HttpResponse response = initHttpClient().execute(hg);
		return response;
	}
	
	/**
	 * Send and get response from the specified url, and convert to a string characters
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 * @throws Exception
	 */
	public static String getHttpGetContent(String url, String encoding) throws Exception{
		HttpResponse response = getHttpGetResponse(url);
		return IOUtils.toString(response.getEntity().getContent(), encoding);
	}
	
}
