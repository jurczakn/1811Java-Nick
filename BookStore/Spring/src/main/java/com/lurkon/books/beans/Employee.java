package com.lurkon.books.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="emp")
@PrimaryKeyJoinColumn(name="ID") 
public class Employee extends User{
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="sup_id")
	private Employee supervisor;
	private String title;
	public Employee() {
		super();
	}
	public Employee(int id, String username, String password, String first, String last) {
		super(id, username, password, first, last);
	}
	public Employee(Employee supervisor, String title) {
		super();
		this.supervisor = supervisor;
		this.title = title;
	}
	public Employee(int id, String username, String password, String first, String last, Employee supervisor, String title) {
		super(id, username, password, first, last);
		this.supervisor = supervisor;
		this.title = title;
	}
	public Employee getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((supervisor == null) ? 0 : supervisor.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (obj==null || getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (supervisor == null) {
			if (other.supervisor != null)
				return false;
		} else if (!supervisor.equals(other.supervisor))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n\tEmployee [supervisor=");
		builder.append(supervisor);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}
	
}
