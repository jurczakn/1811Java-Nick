package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.pojos.User;

@Service
public class AuthService {
	
	public User validateUser(User user){
		
		User validUser = null;
		
		if ("radioftw".equals(user.getUsername()) && "howaboutgod".equals(user.getPassword())){
			validUser = user;
			validUser.setFullName("Jacob Somelastname");
		}
		
		return validUser;
		
	}

}
