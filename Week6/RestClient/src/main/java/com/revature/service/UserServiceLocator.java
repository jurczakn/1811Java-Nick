package com.revature.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.pojo.User;

@Service
public class UserServiceLocator implements UserService {

	private static final String baseUrl = "http://localhost:8080/MVCExample";
	
	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<User>> responseEntity =
				restTemplate.exchange(
						baseUrl + "/user", 
						HttpMethod.GET, 
						null, 
						new ParameterizedTypeReference<List<User>>() {});
		
		List<User> userList = responseEntity.getBody();
		HttpStatus httpStatus = responseEntity.getStatusCode();
		
		System.out.println("Status Code: " + httpStatus.value());
		
		if(httpStatus.is2xxSuccessful())
			return userList;
		
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

}
