package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.LifeCycleBean;

public class Driver {

	public static void main(String[] args) {
		LifeCycleBean lb = (LifeCycleBean) new ClassPathXmlApplicationContext("master.xml").getBean("lifeCycle");
		System.exit(0);
	}
	
}
