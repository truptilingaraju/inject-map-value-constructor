package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("my_config.xml");
		Shop shop=(Shop)context.getBean("myShop");
		System.out.println(shop);
	}
}
