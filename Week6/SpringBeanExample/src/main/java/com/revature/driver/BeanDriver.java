package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.House;

public class BeanDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		House h = (House) ac.getBean("house");
		
		h.setName("Zaryn");
		h.getWall().setMaterial("cotton candy");
		
		House h2 = (House) ac.getBean("house");
		
		h2.setName("Anthony's House");
		h2.getWall().setMaterial("beans");
		
		House h3 = (House) ac.getBean("house");
		
		System.out.println("h2: " + h2);
		System.out.println("h: " + h);
		System.out.println("h3: " + h3);
	}

}
