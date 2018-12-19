package com.lurkon.books.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="address")
	@SequenceGenerator(name="address", sequenceName="address_seq", allocationSize=1)
	private int id;
	@Column(name="lineone")
	private String lineOne;
	@Column(name="linetwo")
	private String lineTwo;
	private String city;
	private String state;
	private String zip;
	public Address() {
		super();
	}
	public Address(int id, String lineOne, String lineTwo, String city, String state, String zip) {
		super();
		this.setId(id);
		this.setLineOne(lineOne);
		this.setLineTwo(lineTwo);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLineOne() {
		return lineOne;
	}
	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}
	public String getLineTwo() {
		return lineTwo;
	}
	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((lineOne == null) ? 0 : lineOne.hashCode());
		result = prime * result + ((lineTwo == null) ? 0 : lineTwo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Address))
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (lineOne == null) {
			if (other.lineOne != null)
				return false;
		} else if (!lineOne.equals(other.lineOne))
			return false;
		if (lineTwo == null) {
			if (other.lineTwo != null)
				return false;
		} else if (!lineTwo.equals(other.lineTwo))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=");
		builder.append(id);
		builder.append(", lineOne=");
		builder.append(lineOne);
		builder.append(", lineTwo=");
		builder.append(lineTwo);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", zip=");
		builder.append(zip);
		builder.append("]");
		return builder.toString();
	}
}
