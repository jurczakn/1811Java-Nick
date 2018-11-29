package com.revature.service;

import java.util.List;

import com.revature.dao.ListUserDao;
import com.revature.dao.UserDao;
import com.revature.domain.User;

public class UserService {
	
	UserDao uDao = new ListUserDao();
	
	public User readUser(String username){
		return uDao.getUserByUsername(username);
	}
	
	public List<User> readAllUsers(){
		return uDao.getAllUsers();
	}
	
	public void makeUser(User user){
		uDao.createUser(user);
	}

}
