package com.revature.util;

import javax.servlet.http.HttpServlet;

import com.revature.servlet.HomeServlet;
import com.revature.servlet.LoginServlet;
import com.revature.servlet.PageNotFoundServlet;

public class RequestHelper {
	
	private static HttpServlet homeServlet = new HomeServlet();
	private static HttpServlet loginServlet = new LoginServlet();
	private static HttpServlet pnfServlet = new PageNotFoundServlet();
	
	public HttpServlet dispatchRequest(String path){
		
		HttpServlet nextServlet = null;
		
		switch (path) {
		
		case "/FrontController/app/login":
			nextServlet = loginServlet;
			break;
		
		case "/FrontController/app/home":
			nextServlet = homeServlet;
			break;
			
		default:
			nextServlet = pnfServlet;
		
		}
		
		return nextServlet;
		
	}

}
