package com.revature.dao;

import java.util.List;

import com.revature.domain.User;

public interface UserDao {
	
	public User getUserByUsername(String username);
	
	public void updateUser(User user);
	
	public void createUser(User user);
	
	public void deleteUser(User user);
	
	public List<User> getAllUsers();

}
