package com.usk.mongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.usk.mongodb.document.TestDocument;

@RestController
@RequestMapping("/mongodbtest")
public class MongoDBTest {

	@Autowired
	MongoClient mongoClient;
	
	private static final String DB_NAME = "uskDB";

	@GetMapping("/save")
	public String saveDocuent2(@RequestParam String id, @RequestParam String name) {
		MongoDatabase database = mongoClient.getDatabase(DB_NAME);
		MongoCollection<Document> collection = database.getCollection("uskcollection", Document.class);
		Document document = new Document();
		document.append("id", id);
		document.append("name", name);
		collection.insertOne(document);
		return "Success";
	}

	@GetMapping("/getfirstdoc")
	public String getFirstDocuents() {
		MongoDatabase database = mongoClient.getDatabase(DB_NAME);
		MongoCollection<Document> collection = database.getCollection("uskcollection");
		Document firstDoc = collection.find().first();
		return firstDoc.toJson();
	}

	@GetMapping("/getallaslist")
	public List<Document> getDocuents() {
		MongoDatabase database = mongoClient.getDatabase(DB_NAME);
		List<Document> collection = database.getCollection("uskcollection").find().into(new ArrayList<>());
		return collection;
	}
	
	@GetMapping("/getallascustomdoc")
	public List<TestDocument> getCustomDocuents() {
		MongoDatabase database = mongoClient.getDatabase(DB_NAME);
		MongoCollection<TestDocument> collection = database.getCollection("uskcollection", TestDocument.class);
		System.out.println("collection ==========>> " + collection);
		List<TestDocument> testDocuments = new ArrayList<>();
		collection.find().forEach(doc -> testDocuments.add(doc));
		return testDocuments;
	}

}
