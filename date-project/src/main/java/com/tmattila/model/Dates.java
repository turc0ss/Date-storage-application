package com.tmattila.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dates")
public class Dates {
	
	@Id
	private String id;
	
	@Field(value="Title:")
	private String title;
	
	@Field(value = "Date:")
	private String dateForm;
	
	public Dates(String title, String dateForm) {
		this.title = title;
		this.dateForm = dateForm;
	}
}