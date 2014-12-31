package com.spring.core;

import org.springframework.stereotype.Service;

@Service("helloWorld")
public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello : "+this.name;
	}
}