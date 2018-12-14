package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.pojos.User;
import com.revature.services.AuthService;

@Controller
public class LoginCtrl {

	@Autowired
	private AuthService authService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet(HttpSession sess){
		
		if (sess.getAttribute("user") != null){
			return "home";
		}
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPost(@Valid User user, BindingResult bindingResult, HttpSession sess, ModelMap modelMap){
		
		User authUser = authService.validateUser(user);
		
		System.out.println(authUser);
		
		if(bindingResult.hasErrors()){
			modelMap.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
			return "login";
		}
		
		if(authUser != null){
			sess.setAttribute("user", authUser);
			modelMap.addAttribute("user", authUser);
			return "home";
		}
		
		return "login";
	}
	
}
