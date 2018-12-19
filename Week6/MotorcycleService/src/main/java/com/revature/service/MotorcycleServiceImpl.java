package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bean.Motorcycle;
import com.revature.repo.MotorcycleRepo;

@Service
public class MotorcycleServiceImpl implements MotorcycleService {

	@Autowired
	MotorcycleRepo mcRepo;
	
	@Override
	public Motorcycle getMotorcycleById(Integer id) {
		return mcRepo.findOne(id);
	}

	@Override
	public List<Motorcycle> getAllMotorcycles() {
		return mcRepo.findAll();
	}

	@Override
	public void createMotorcycle(Motorcycle motorcycle) {
		mcRepo.save(motorcycle);
	}

	@Override
	public void deleteMotorcycle(Integer id) {
		mcRepo.delete(id);
	}

}
