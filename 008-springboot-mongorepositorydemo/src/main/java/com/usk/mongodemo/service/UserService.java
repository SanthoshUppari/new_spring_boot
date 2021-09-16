package com.usk.mongodemo.service;

import java.util.List;

import com.usk.mongodemo.entity.User;

public interface UserService {
	
	public List<User> getUserCollection();

	List<User> getUserDocumentsByName(String name);

	List<User> getUserDocumentsByNameAndPin(String name, String pin);

	List<User> getDocumentsByNamepin(String name, String pin);

	List<User> getDocumentsByName(String name);

	User saveUser(User user);

}
