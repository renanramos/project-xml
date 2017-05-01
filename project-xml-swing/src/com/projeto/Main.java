package com.projeto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Main {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("META-INF/spring-config.xml");		
	}
}
