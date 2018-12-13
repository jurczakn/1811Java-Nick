package com.revature.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.services.DogPileService;

public class Driver {

	public static void main(String[] args) {

		DogPileService dps = (DogPileService) new ClassPathXmlApplicationContext("beans.xml").getBean("dogPileService");
		
		dps.dogPile(7);
		
		dps.dogRest();
		
		dps.prepare();
		
	}

}
