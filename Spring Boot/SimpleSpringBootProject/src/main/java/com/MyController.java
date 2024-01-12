package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/")					//http://localhost:8080/
	public String openIndex() {						
		System.out.println("I came in index");
		return "index";								//this is our file name without extension
	}
	
	@RequestMapping(value = "/hi")					//http://localhost:8080/
	public String hiPage() {					
		System.out.println("I came in hi path");
		return "hiPage";								//this is our file name without extension
	}
	
	@RequestMapping(value = "/hello")					//http://localhost:8080/
	public String helloPageOpen() {					
		System.out.println("I came in hello path");
		return "helloPage";								//this is our file name without extension
	}
}
