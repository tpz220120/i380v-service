package com.weixin.utils.http;

import java.util.HashMap;
import java.util.Map;

import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

public class RPCUtils {

	public static RetryTemplate getRetryTemplate() {
		return getRetryTemplate(1000);
	}
	
	public static RetryTemplate getRetryTemplate(int sleepMillSecond) {
		RetryTemplate template = new RetryTemplate(); 
		Map<Class<? extends Throwable>, Boolean> exceptionRetry = new HashMap<Class<? extends Throwable>, Boolean>();;
		exceptionRetry.put(Exception.class, true);
		
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy(3, exceptionRetry);
		retryPolicy.setMaxAttempts(3);
		template.setRetryPolicy(retryPolicy);
		//template.registerListener(new IntervalRetryListener(sleepMillSecond));//sleep 1 second
		return template;
	}
}
