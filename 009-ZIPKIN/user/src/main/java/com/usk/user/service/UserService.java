package com.usk.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;

	public String getUserOrders() {
		String baseUrl = "http://localhost:8082/order-service/orders";
		String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		return response;
	}

}
