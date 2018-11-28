package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Inside do Get of Lifecycle Servlet");
		System.out.println("Inside do Get of Lifecycle Servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Inside do Post of Lifecycle Servlet");
		System.out.println("Inside do Post of Lifecycle Servlet");
		
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside init()");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Inside service()");
		super.service(arg0, arg1);
	}

	
	
}
