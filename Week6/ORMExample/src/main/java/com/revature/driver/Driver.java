package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.HoneyPotRepository;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("data.xml");
		
		HoneyPotRepository hpDao = (HoneyPotRepository) ap.getBean("honeyPotRepository");
		
		System.out.println(hpDao.findAll());
		
		System.out.println(hpDao.findByHoneypotAmount(4.0));
	}
	
	

}
