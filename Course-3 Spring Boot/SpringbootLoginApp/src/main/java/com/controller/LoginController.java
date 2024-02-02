package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/")				// http://localhost:9090/
	public String openLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String loginCheckDetails(HttpServletRequest req,Model mm) {	// DI HttpServletRequest 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		if(emailid.equals("umera@gmail.com") && password.equals("umera@123")) {
		mm.addAttribute("msg", "umera@gmail.com");	// request.setAttribute("msg","umera@gmail.com");
			return "success";
		}else {
			return "failure";
		}
	}
}
