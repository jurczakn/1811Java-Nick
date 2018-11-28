package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.domain.User;

public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession sess = req.getSession();

		User user = (User) sess.getAttribute("user");

		String username = null;

		if (user != null) {
			username = user.getUsername();
		}
		
		System.out.println(username);

		if (username == null) {
			resp.sendRedirect("login.html");
		}

		else {
			// forward to home page
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
