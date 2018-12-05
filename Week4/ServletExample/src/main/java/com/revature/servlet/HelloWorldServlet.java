package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		System.out.println("Hello World!!!");
		//Print Writer allows you to write directly to the response
		PrintWriter writer = resp.getWriter();
		writer.write("Hello from Get");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		PrintWriter writer = resp.getWriter();
		writer.write("Hello from Post");
	}
	
}
