package com.usk.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usk.user.events.publish.UserEventPublisher;

@RestController
@RequestMapping("/events")
public class EventPublishController {
	
	@Autowired
	UserEventPublisher userEventPublisher;
	
	@GetMapping("/publish")
	public String publishEvents() {
		userEventPublisher.publishEvent("publishing event");
		return "Success";
	}

}
