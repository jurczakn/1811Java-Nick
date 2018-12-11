package com.revature.domains;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cave")
public class Cave {
	
	@Id
	@Column(name="cave_id")
	@SequenceGenerator(name="caveid_seq", sequenceName="caveid_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="caveid_seq")
	private Integer caveId;
	
	@Column(name="cave_type")
	private String caveType;
	
	@Column(name="sq_footage")
	private double sqFootage;
	
	@OneToMany(mappedBy="bearHome", fetch=FetchType.LAZY)
	private List<Bear> residents;

	public List<Bear> getResidents() {
		return residents;
	}

	public void setResidents(List<Bear> residents) {
		this.residents = residents;
	}

	public Integer getCaveId() {
		return caveId;
	}

	public void setCaveId(Integer caveId) {
		this.caveId = caveId;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public Cave(Integer caveId, String caveType, double sqFootage) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
	}

	public Cave() {
		super();
	}

	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", caveType=" + caveType + ", sqFootage=" + sqFootage + ", residents="
				+ residents + "]";
	}


}

