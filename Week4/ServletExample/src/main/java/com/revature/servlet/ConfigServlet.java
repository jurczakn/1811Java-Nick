package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Accessing Servlet Config in 2 ways
		String type = getServletConfig().getInitParameter("type");
		
		String permissions = getInitParameter("permissions");
		
		//Accessing Servlet Context
		String company = getServletConfig().getServletContext().getInitParameter("company");
		
		String department = getServletContext().getInitParameter("department");
		
		response.getWriter().write("<h1>Welcome to the "
				+ company + " home page for the "
						+ department + " department for "
								+ type + " users with "
										+ permissions + "permissions.</h1>" );
	}

}
