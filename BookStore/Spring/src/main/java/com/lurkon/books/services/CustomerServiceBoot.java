package com.lurkon.books.services;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lurkon.books.beans.Customer;
import com.lurkon.books.repos.CustomerDao;

@Component
public class CustomerServiceBoot implements CustomerService {
	@Autowired
	private CustomerDao cd;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer getCustomer(String username, String password) {
		Customer c = cd.getByUsernameAndPassword(username, password);
		entityManager.detach(c);
		return c;
	}

	@Override
	public Customer getCustomerById(int i) {
		return cd.findOne(i);
	}

	@Override
	public Set<Customer> getCustomers() {
		Set<Customer> custs = new HashSet<>();
		Iterable<Customer> iterable = cd.findAll();
		iterable.forEach(custs::add);
		return custs;
	}

	@Override
	public void deleteCustomer(Customer cust) {
		cd.delete(cust);
	}

	@Override
	public void updateCustomer(Customer cust) {
		cd.save(cust);
	}

	@Override
	public void newCustomer(Customer cust) {
		cd.save(cust);
	}
	
	// setters and getters for autowiring
	public CustomerDao getCd() {
		return cd;
	}

	public void setCd(CustomerDao cd) {
		this.cd = cd;
	}
}
