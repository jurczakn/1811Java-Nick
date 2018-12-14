package com.revature.driver;

import org.jboss.jandex.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.HoneyPotDao;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		
		HoneyPotDao hpDao = (HoneyPotDao) ap.getBean("honeyPotImpl");
		
		System.out.println(hpDao.getAllHoneyPots());
	}
	
	

}
