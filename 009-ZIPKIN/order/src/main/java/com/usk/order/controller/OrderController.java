package com.usk.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.usk.order.dto.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public List<Order> getOrders() {
		String baseUrl = "http://localhost:8083/delivery-service/delivery";
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		
		List<Order> orders = new ArrayList<>();
		Order order = new Order();
		order.setId(1);
		order.setDesc("test");
		order.setDelivery(response);
		orders.add(order);
		return orders;
	}

}
