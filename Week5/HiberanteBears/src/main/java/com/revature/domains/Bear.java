package com.revature.domains;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bear")
public class Bear {
	
	@Id
	@Column(name="bear_id")
	@SequenceGenerator(name="bearid_seq", sequenceName="bearid_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bearid_seq")
	private Integer bearId;
	
	@Column(name="bear_color")
	private String bearColor;
	
	@Column(name="breed")
	private String bearBreed;
	
	@Column(name="height")
	private double height;
	
	@Column(name="weight")
	private double weight;
	
	@OneToOne
	@JoinColumn(name="honeypot_id")
	private HoneyPot honeyPot;
	
	@ManyToOne
	@JoinColumn(name="bear_home")
	private Cave bearHome;
	
	@ManyToMany
	@JoinTable(name="parent_cub",
				joinColumns=@JoinColumn(name="bear_id"),
				inverseJoinColumns=@JoinColumn(name="cub_id"))
	private Set<Bear> bearCubs;

	public Integer getBearId() {
		return bearId;
	}

	public void setBearId(Integer bearId) {
		this.bearId = bearId;
	}

	public String getBearColor() {
		return bearColor;
	}

	public void setBearColor(String bearColor) {
		this.bearColor = bearColor;
	}

	public String getBearBreed() {
		return bearBreed;
	}

	public void setBearBreed(String bearBreed) {
		this.bearBreed = bearBreed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public HoneyPot getHoneyPot() {
		return honeyPot;
	}

	public void setHoneyPot(HoneyPot honeyPot) {
		this.honeyPot = honeyPot;
	}

	public Cave getBearHome() {
		return bearHome;
	}

	public void setBearHome(Cave bearHome) {
		this.bearHome = bearHome;
	}

	public Bear() {
		super();
	}

	public Bear(Integer bearId, String bearColor, String bearBreed, double height, double weight, HoneyPot honeyPot,
			Cave bearHome) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.bearBreed = bearBreed;
		this.height = height;
		this.weight = weight;
		this.honeyPot = honeyPot;
		this.bearHome = bearHome;
	}

	@Override
	public String toString() {
		return "Bear [bearId=" + bearId + ", bearColor=" + bearColor + ", bearBreed=" + bearBreed + ", height=" + height
				+ ", weight=" + weight + ", honeyPot=" + honeyPot + ", bearHome=" + bearHome + "]";
	}
	

}
