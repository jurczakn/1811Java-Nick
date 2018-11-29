package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.domain.User;

public class ListUserDao implements UserDao{
	
	private static List<User> repo;

	public User getUserByUsername(String username) {
		
		for (User user : repo){
			if(user.getUsername().equals(username)){
				return user;
			}
		}
		
		return null;
	}

	public void updateUser(User user) {
		
	}

	public void createUser(User user) {
		repo.add(user);
	}

	public void deleteUser(User user) {
		
	}

	public List<User> getAllUsers() {
		return repo;
	}
	
	public ListUserDao(){
		repo = new ArrayList<User>();
		repo.add(new User("usera", "pass", "a", "user", 5));
		repo.add(new User("userb", "pass", "b", "use", 5));
		repo.add(new User("userd", "pass", "d", "used", 5));
		repo.add(new User("userc", "pass", "c", "use'um", 5));
		
	}

}
