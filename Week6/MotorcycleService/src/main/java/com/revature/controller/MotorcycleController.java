package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Motorcycle;
import com.revature.service.MotorcycleService;

@RestController("/motorcycle")
public class MotorcycleController {
	
	@Autowired
	MotorcycleService mcService;
	
	@GetMapping
	public List<Motorcycle> getAllMotorcycles(){
		return mcService.getAllMotorcycles();
	}
	
	@GetMapping("/motorcycle/{id}")
	public Motorcycle getMotorcycle(@PathVariable Integer id){
		return mcService.getMotorcycleById(id);
	}
	
	@PostMapping
	public void makeMotorcycle(@RequestBody Motorcycle motorcycle){
		mcService.createMotorcycle(motorcycle);
	}
	
	@DeleteMapping("/motorcycle/{id}")
	public void removeMotorcycle(@PathVariable Integer id){
		mcService.deleteMotorcycle(id);
	}

}
