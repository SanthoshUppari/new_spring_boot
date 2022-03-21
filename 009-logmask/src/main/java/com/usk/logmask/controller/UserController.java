package com.usk.logmask.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usk.logmask.dto.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@PostMapping
	public String saveUser(@RequestBody User user) {
		log.info("User JSON: {}", user.toString());
		return "Success";
	}
}
