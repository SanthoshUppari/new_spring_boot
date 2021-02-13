package com.usk.delivery.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

	Logger logger = org.slf4j.LoggerFactory.getLogger(DeliveryController.class);

	@GetMapping("/deliverytest")
	public String test() {
		logger.info("From delivery.");
		return "Delivery req placed.";
	}
}
