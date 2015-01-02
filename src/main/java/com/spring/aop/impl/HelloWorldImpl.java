package com.spring.aop.impl;

import com.spring.aop.def.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloMessage() {
		return "Hello AOP";
	}

	@Override
	public String sayHello() {
		System.out.println("Welcome and "+getHelloMessage());
		return "abc";
	}

}
