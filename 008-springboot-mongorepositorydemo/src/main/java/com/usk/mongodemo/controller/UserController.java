package com.usk.mongodemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usk.mongodemo.entity.User;
import com.usk.mongodemo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping
	public List<User> getUserCollection(){ 
		return userService.getUserCollection();
	}
	
	@GetMapping("/byname")
	public List<User> getUserDocumentsByName(@RequestParam String name){ 
		return userService.getUserDocumentsByName(name);
	}
	
	@GetMapping("/bynameandpin")
	public List<User> getUserDocumentsByNameAndPin(@RequestParam String name, String pin){ 
		return userService.getUserDocumentsByNameAndPin(name, pin);
	}
	
	@GetMapping("/bynamecustom")
	public List<User> getDocumentsByName(@RequestParam String name){ 
		return userService.getDocumentsByName(name);
	}
	
	@GetMapping("/bynameandpincustom")
	public List<User> getDocumentsByNamepin(@RequestParam String name, String pin){ 
		return userService.getDocumentsByNamepin(name, pin);
	}
}
