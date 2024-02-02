package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.entity.Feedback;
import com.repository.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepository;
	
	public String storeFeedback(Feedback feedback) {
		Optional<Feedback> result = feedbackRepository.findById(feedback.getId());
		if(result.isPresent()) {
			return "Feedback id must be unique";
		} else {
			feedbackRepository.save(feedback);
			return "Your Feedback has been saved";
		}
	}
	
	public List<Feedback> displayFeedback(){
		return feedbackRepository.findAll();
	}
}
