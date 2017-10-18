package com.ly.dubbo.service.impl;

import com.ly.dubbo.service.TestService;


public class TestServiceImpl implements TestService {

	public String build(String name) throws Exception {
		System.out.println(" got a argument: " + name);
		return "message from provider: " + name;
	}
	
	public String testSayDubbo() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Dubbo say:Hello!!!!!");
		return stringBuffer.toString();
	}

	public String say(String name) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name+" say:Hello!!!!!");
		return stringBuffer.toString();
	}

}
