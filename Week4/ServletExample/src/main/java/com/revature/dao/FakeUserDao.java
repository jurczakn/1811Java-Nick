package com.revature.dao;

import com.revature.domain.User;

public class FakeUserDao implements UserDao {

	public User getUserByUsername(String username) {
		if ("nick".equals(username)){
			User ret = new User();
			ret.setFname("Nick");
			ret.setLname("J");
			ret.setPassword("1234");
			ret.setUsername("nick");
			ret.setNumberOfLegs(2);
			return ret;
		}
		return null;
	}

}
