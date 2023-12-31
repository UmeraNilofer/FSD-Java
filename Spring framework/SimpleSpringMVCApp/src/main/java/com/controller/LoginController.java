package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "checkLogin",method = RequestMethod.POST)
	public ModelAndView checkLoginDetails(HttpServletRequest req) {	// DI for HttpRequest object 
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();
		if(email.equals("umera@gmail.com") && password.equals("umera@123")) {
			mav.addObject("user", "umera@gmail.com"); // it is equal to req.setAttribute("user","umera@gmail.com");
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}

