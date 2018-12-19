package com.lurkon.books.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity  
@Table(name="customer")
@PrimaryKeyJoinColumn(name="ID")  
public class Customer extends User
{
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="READING_LIST",
			joinColumns=@JoinColumn(name="cust_id"),
			inverseJoinColumns=@JoinColumn(name="book_id"))
	private Set<Book> readingList;

	public Customer() {
		super();
	}

	public Customer(int id, String username, String password, String first, String last) {
		super(id, username, password, first, last);
	}
	
	public Customer(Address address, Set<Book> readingList) {
		super();
		this.address = address;
		this.readingList = readingList;
	}
	
	public Customer(int id, String username, String password, String first, String last, Address address, Set<Book> readingList) {
		super(id, username, password, first, last);
		this.address = address;
		this.readingList = readingList;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Book> getReadingList() {
		return readingList;
	}

	public void setReadingList(Set<Book> readingList) {
		this.readingList = readingList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((readingList == null) ? 0 : readingList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (readingList == null) {
			if (other.readingList != null)
				return false;
		} else if (!readingList.equals(other.readingList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Customer [address=");
		builder.append(address);
		builder.append(", readingList=");
		builder.append(readingList);
		builder.append("]");
		return builder.toString();
	}
}
