package com.usk.mongodemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.usk.mongodemo.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	List<User> findByName(String name);
	
	List<User> findByNameAndPin(String name, String pin);
	
	@Query("{\"name\" : \"BNG\"}")
	List<User> getDocumentsByName(String name);
	
	@Query("{\"name\" : \"BNG\", \"pin\" : \"560060\"}")
	List<User> getDocumentsByNamepin(String name, String pin);
}