package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.pojos.User;

@Service
public class UserService {
	
	private List<User> repo = new ArrayList<User>();
	
	public List<User> getAllUsers(){
		return this.repo;
	}
	
	public void createUser(User user){
		repo.add(user);
	}
	
	public User getUserByUsername(String username){
		for(User user: this.repo){
			if (user.getUsername().equals(username)){
				return user;
			}
		}
		
		return null;
		
	}

}
