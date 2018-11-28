package com.revature.dao;

import com.revature.domain.User;

public interface UserDao {
	
	public User getUserByUsername(String username);

}
