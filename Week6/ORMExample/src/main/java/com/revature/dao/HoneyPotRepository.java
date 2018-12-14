package com.revature.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.domains.HoneyPot;

@Repository("honeyPotRepository")
public interface HoneyPotRepository extends JpaRepository<HoneyPot, Integer>{

		public List<HoneyPot> findByHoneypotAmount(Double amount);
	
}
