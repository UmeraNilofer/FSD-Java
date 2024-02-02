package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Feedback;
import com.service.FeedbackService;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(value = "displayFeedback",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Feedback> displayFeedback() {
		return feedbackService.displayFeedback();
	}
	
	@RequestMapping(value = "storeFeedback",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeFeedback(Feedback feedback) {	
		System.out.println(feedback);     // toString method 
		return feedbackService.storeFeedback(feedback);
	}
}
