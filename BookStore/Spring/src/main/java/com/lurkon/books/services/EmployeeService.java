package com.lurkon.books.services;

import java.util.Set;

import com.lurkon.books.beans.Employee;

public interface EmployeeService {
	public Employee getEmployee(String username, String password);
	public Employee getEmployeeById(int i);
	public Set<Employee> getEmployees();
	public void deleteEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void newEmployee(Employee emp);
}
