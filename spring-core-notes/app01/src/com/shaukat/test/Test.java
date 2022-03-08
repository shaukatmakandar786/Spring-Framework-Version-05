package com.shaukat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shaukat.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloBean hBean=(HelloBean)context.getBean("helloBean");
		System.out.println(hBean.sayHello());
	}

}
