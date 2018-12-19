package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.revature.bean.Motorcycle;
import com.revature.service.MotorcycleService;

@SpringBootApplication
public class MotorcycleServiceApplication implements CommandLineRunner{

	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(MotorcycleServiceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		MotorcycleService motorcycleService = 
				(MotorcycleService) context.getBean("motorcycleServiceImpl");
		motorcycleService.createMotorcycle(new Motorcycle(-1, "Harley", "Heritage Classic", 2017));
		motorcycleService.createMotorcycle(new Motorcycle(-1, "Indian", "Cheiftan", 2019));
		motorcycleService.createMotorcycle(new Motorcycle(-1, "Yamaha", "Roadstar", 2007));
		
	}

}

