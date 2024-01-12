package com.ecommerce.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.ecommerce.beans.CustomEventPublisher;

@Controller
public class MainController {

	public String customEvent(ModelMap map) {
		String confFile = "main-servlet.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		CustomEventPublisher cvp = (CustomEventPublisher)context.getBean("customEventPublisher");
		
		cvp.publish();
		cvp.publish();
		return "customEvent";
	}
}
