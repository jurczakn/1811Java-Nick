package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojos.User;
import com.revature.services.UserService;

//combines the @Controller and @RequestBody annotations
@RestController("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	@PostMapping(consumes = "application/json")
	public void makeUser(@RequestBody User user){
		System.out.println("User: " + user);
		userService.createUser(user);
	}
	
	@GetMapping("/user/{username}")
	public User getUserByUsername(@PathVariable String username){
		return userService.getUserByUsername(username);
	}
	
}
