package com.usk.mongodemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.mongodemo.entity.User;
import com.usk.mongodemo.repository.UserRepository;
import com.usk.mongodemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		return userRepository.insert(user);
	}
	
	@Override
	public List<User> getUserCollection(){
		return userRepository.findAll();
	}
	
	@Override
	public List<User> getUserDocumentsByName(String name){
		return userRepository.findByName(name);
	}

	@Override
	public List<User> getUserDocumentsByNameAndPin(String name, String pin){
		return userRepository.findByNameAndPin(name, pin);
	}
	
	@Override
	public List<User> getDocumentsByName(String name){
		return userRepository.getDocumentsByName(name);
	}

	@Override
	public List<User> getDocumentsByNamepin(String name, String pin){
		return userRepository.getDocumentsByNamepin(name, pin);
	}
}
