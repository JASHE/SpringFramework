package com.spring.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.def.HelloWorld;

public class SpringAspectTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
		hw.sayHello();
		((ConfigurableApplicationContext)context).close();
	}

}
