package com.revature.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Octopus implements ThreeLegged {
	
	@Value("3")
	private Integer numberOfLegs;

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Octopus [numberOfLegs=" + numberOfLegs + "]";
	}

	public Octopus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Octopus(Integer numberOfLegs) {
		super();
		this.numberOfLegs = numberOfLegs;
	}

}
