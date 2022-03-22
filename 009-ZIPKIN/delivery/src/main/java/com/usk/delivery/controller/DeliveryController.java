package com.usk.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usk.delivery.dto.Delivery;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@GetMapping
	public Delivery getDeliveries() {
		Delivery delivery = new Delivery();
		delivery.setId(101);
		delivery.setTrackingUrl("http://tyn.com/sdasda");
		return delivery;
	}
}
