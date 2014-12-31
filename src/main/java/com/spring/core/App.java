package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.setName("testAnnotationName");
		System.out.println(obj.sayHello());
		
		// destroying the spring context
		((ConfigurableApplicationContext)context).close();
	}
}
