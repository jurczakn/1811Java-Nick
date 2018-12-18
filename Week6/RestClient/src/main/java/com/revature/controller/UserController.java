package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.UserService;

@RestController("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public void createUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable String username){
		User user = userService.getUserByUsername(username);
		user.setUsername("From Client: " + user.getUsername());
		return user;
	}

}
