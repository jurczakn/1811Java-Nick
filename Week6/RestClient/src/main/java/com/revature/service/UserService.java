package com.revature.service;

import java.util.List;

import com.revature.pojo.User;

public interface UserService {
	
	public User getUserByUsername(String username);
	
	public List<User> getAllUsers();
	
	public void addUser(User user);

}
