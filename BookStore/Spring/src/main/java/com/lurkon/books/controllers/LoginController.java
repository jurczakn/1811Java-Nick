package com.lurkon.books.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lurkon.books.beans.Customer;
import com.lurkon.books.beans.Employee;
import com.lurkon.books.beans.LoginInfo;
import com.lurkon.books.services.CustomerService;
import com.lurkon.books.services.EmployeeService;

@RestController
@RequestMapping(value="/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	@Autowired
	private CustomerService cs;
	@Autowired
	private EmployeeService es;
	
	@RequestMapping(method=RequestMethod.GET)
	public LoginInfo login(HttpSession session) {
		return (LoginInfo) session.getAttribute("loggedUser");
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public LoginInfo login(@RequestParam("user") String username, @RequestParam("pass") String password, HttpSession session) {
		Customer c = cs.getCustomer(username, password);
		Employee e = es.getEmployee(username, password);
		if(e==null && c==null)
			return null;
		LoginInfo loggedUser = new LoginInfo(c, e);
		session.setAttribute("loggedUser", loggedUser);
		return loggedUser;
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
