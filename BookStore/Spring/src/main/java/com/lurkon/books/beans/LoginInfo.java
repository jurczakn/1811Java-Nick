package com.lurkon.books.beans;

public class LoginInfo {
	private Customer customer;
	private Employee employee;
	
	public LoginInfo() {
		super();
	}
	public LoginInfo(Customer cust, Employee emp) {
		super();
		this.customer = cust;
		this.employee = emp;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer cust) {
		this.customer = cust;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee emp) {
		this.employee = emp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginInfo other = (LoginInfo) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginInfo [cust=");
		builder.append(customer);
		builder.append(", emp=");
		builder.append(employee);
		builder.append("]");
		return builder.toString();
	}
}
