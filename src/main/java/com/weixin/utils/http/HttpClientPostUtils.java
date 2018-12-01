package com.weixin.utils.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class HttpClientPostUtils {

	public static CloseableHttpClient initHttpClient() {
		return HttpClientBuilder.create().build();
	}
	
	public static HttpResponse getHttpPostResponse(String url) throws Exception {
		return getHttpPostResponse(url, new ArrayList<NameValuePair>(),
				HttpClientConstants.UTF_8);
	}

	public static HttpResponse getHttpPostResponse(String url,
			Map<String, String> params, String encoding) throws Exception {
		return getHttpPostResponse(url, generatePostParams(params), encoding);
	}
	
	public static HttpResponse getHttpPostResponse(String url,
			String params, String encoding) throws Exception {
		return getHttpPostResponse(url, convertPOSTParametersToNVP(params), encoding);
	}

	public static String getHttpPostContent(String url, String read_encoding)
			throws Exception {
		return getHttpPostContent(url, new ArrayList<NameValuePair>(),
				read_encoding);
	}
	
	public static String getHttpPostContentByEntity(String url, StringEntity entity, String read_encoding) throws Exception{
		HttpPost post = new HttpPost(url);
		post.setHeader(HttpClientConstants.headerName_content_type,HttpClientConstants.headerValue_form);
		post.setEntity(entity);
		
		return IOUtils.toString(initHttpClient().execute(post).getEntity().getContent(), read_encoding);
	}
	
	public static String getHttpPostContent(String url,
			Map<String, String> params, String read_encoding) throws Exception {
		return getHttpPostContent(url, generatePostParams(params),
				read_encoding);
	}
	
	public static String getHttpPostContent(String url,
			String params, String read_encoding) throws Exception {
		return getHttpPostContent(url, convertPOSTParametersToNVP(params),
				read_encoding);
	}

	public static String getHttpPostContent(String url,
			List<NameValuePair> nvps, String read_encoding) throws Exception {
		HttpResponse response = getHttpPostResponse(url, nvps, read_encoding);
		return IOUtils.toString(response.getEntity()
				.getContent(), read_encoding);
	}
	
	public static HttpResponse getHttpPostResponse(String url,
			List<NameValuePair> nvps, String encoding) throws Exception {

		UrlEncodedFormEntity entity = null;
		if (nvps != null && nvps.size() > 0) {
			entity = new UrlEncodedFormEntity(nvps, encoding);
		}
		HttpPost post = new HttpPost(url);
		post.setHeader(HttpClientConstants.headerName_content_type,
				HttpClientConstants.headerValue_form);
		if (entity != null) {
			post.setEntity(entity);
		}

		return initHttpClient().execute(post);
	}

	private static List<NameValuePair> generatePostParams(
			Map<String, String> params) {
		if (params == null) {
			return null;
		}

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		Iterator<String> keyParam = params.keySet().iterator();
		while (keyParam.hasNext()) {
			String key = keyParam.next();
			NameValuePair pair = new BasicNameValuePair(key, params.get(key));
			nvps.add(pair);
		}

		return nvps;
	}
	
	/**
	 * 
	 * 
	 * @param POSTParameters
	 * @return
	 */
	private static Map<String, String> convertPOSTParametersToNVP(
			String POSTParameters) {
		Map<String, String> nvps = new LinkedHashMap<String, String>();
		for (String s : POSTParameters.split("&")) {
			String name = s.split("=")[0];
			String value = s.substring(s.indexOf("=") + 1);
			nvps.put(name, value);
		}
		return nvps;

	}
}
