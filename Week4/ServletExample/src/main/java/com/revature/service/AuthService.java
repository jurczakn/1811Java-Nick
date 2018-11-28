package com.revature.service;

import com.revature.dao.FakeUserDao;
import com.revature.dao.UserDao;
import com.revature.domain.User;

public class AuthService {
	
	UserDao udao = new FakeUserDao();
	
	public User validateUser(String username, String password){
		
		User user = udao.getUserByUsername(username);
		
		if(user == null || !user.getPassword().equals(password)){
			return null;
		}
		
		return user;
		
	}

}
