package com.revature.service;

import java.util.List;

import com.revature.bean.Motorcycle;

public interface MotorcycleService {
	
	public Motorcycle getMotorcycleById(Integer id);
	
	public List<Motorcycle> getAllMotorcycles();
	
	public void createMotorcycle(Motorcycle motorcycle);
	
	public void deleteMotorcycle(Integer id);
	
	

}
