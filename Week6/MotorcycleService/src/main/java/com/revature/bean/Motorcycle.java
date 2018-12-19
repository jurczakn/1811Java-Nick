package com.revature.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Motorcycle {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String make;
	
	@Column
	private String model;
	
	@Column
	private Integer year;

	public Motorcycle(Integer id, String make, String model, Integer year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Motorcycle() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
}
