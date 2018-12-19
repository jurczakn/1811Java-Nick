package com.lurkon.books.services;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lurkon.books.beans.Employee;
import com.lurkon.books.repos.EmployeeDao;

@Component
public class EmployeeServiceBoot implements EmployeeService {
	@Autowired
	private EmployeeDao ed;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Employee getEmployee(String username, String password) {
		Employee e = ed.getByUsernameAndPassword(username, password);
		entityManager.detach(e);
		return e;
	}

	@Override
	public Employee getEmployeeById(int i) {
		return ed.findOne(i);
	}

	@Override
	public Set<Employee> getEmployees() {
		Set<Employee> emps = new HashSet<>();
		Iterable<Employee> iterable = ed.findAll();
		iterable.forEach(emps::add);
		return emps;
	}

	@Override
	public void deleteEmployee(Employee emp) {
		ed.delete(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		ed.save(emp);
	}

	@Override
	public void newEmployee(Employee emp) {
		ed.save(emp);
	}
	
	// setters and getters for autowiring
	public EmployeeDao getEd() {
		return ed;
	}

	public void setEd(EmployeeDao ed) {
		this.ed = ed;
	}
}
