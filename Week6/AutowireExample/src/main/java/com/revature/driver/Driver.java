package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.Cat;

public class Driver {

	public static void main(String[] args) {
		Cat hugo = (Cat) new ClassPathXmlApplicationContext("beans.xml").getBean("cat");
		System.out.println("Cat: " + hugo);
	}

}
