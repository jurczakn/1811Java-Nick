package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.domain.User;
import com.revature.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserService uServ = new UserService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getRequestURI();
		System.out.println("path: " + path);
		ObjectMapper om = new ObjectMapper();
		
		if("/ServletExample/api/user".equals(path)){
			//return entire user list
			List<User> userList = uServ.readAllUsers();
			String userListJson = om.writeValueAsString(userList);
			System.out.println("User List JSON: " + userListJson);
			response.getWriter().write(userListJson);
		}
		
		else{
			//return a single user
			String username = path.substring(path.lastIndexOf('/')+1);
			System.out.println("Username: " + username);
			User user = uServ.readUser(username);
			String userJson = om.writeValueAsString(user);
			System.out.println("user Json: " + userJson);
			response.getWriter().write(userJson);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		String userJson = request.getReader().readLine();
		System.out.println("userJSON: " + userJson);
		User user = om.readValue(userJson, User.class);
		System.out.println("User: " + user);
		uServ.makeUser(user);
		response.setStatus(201);
	}

}
