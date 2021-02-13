package com.usk.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping(value = "/ordertest")
	public String method1() {
		logger.info("From order controller =====>>");
		String baseUrl = "http://localhost:8082/deliverytest";
		return /*String response =*/ (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		//return "Order placed. " + response;
	}

}