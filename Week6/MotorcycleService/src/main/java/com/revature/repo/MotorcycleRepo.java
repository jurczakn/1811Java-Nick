package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bean.Motorcycle;

@Repository
public interface MotorcycleRepo extends JpaRepository<Motorcycle, Integer> {

}
