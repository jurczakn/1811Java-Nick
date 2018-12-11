package com.revature.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="honeypot")
public class HoneyPot {
	
	@Id
	@Column(name="honeypot_id")
	@SequenceGenerator(name="honeypotid_seq", sequenceName="honeypotid_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="honeypotid_seq")
	private Integer honeyPotId;
	
	@Column(name="honeypot_amount")
	private double honeyAmount;
	
	@Column(name="volume")
	private double honeyVolume;

	public Integer getHoneyPotId() {
		return honeyPotId;
	}

	public void setHoneyPotId(Integer honeyPotId) {
		this.honeyPotId = honeyPotId;
	}

	public double getHoneyAmount() {
		return honeyAmount;
	}

	public void setHoneyAmount(double honeyAmount) {
		this.honeyAmount = honeyAmount;
	}

	public double getHoneyVolume() {
		return honeyVolume;
	}

	public void setHoneyVolume(double honeyVolume) {
		this.honeyVolume = honeyVolume;
	}

	public HoneyPot() {
		super();
	}

	public HoneyPot(Integer honeyPotId, double honeyAmount, double honeyVolume) {
		super();
		this.honeyPotId = honeyPotId;
		this.honeyAmount = honeyAmount;
		this.honeyVolume = honeyVolume;
	}

	@Override
	public String toString() {
		return "HoneyPot [honeyPotId=" + honeyPotId + ", honeyAmount=" + honeyAmount + ", honeyVolume=" + honeyVolume
				+ "]";
	}
	
}
