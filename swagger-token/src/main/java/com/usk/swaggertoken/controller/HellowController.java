package com.usk.swaggertoken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	@GetMapping("/hellow")
	public String dataTest() {
		return "Success";
	}
}
