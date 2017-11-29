package com.tmattila.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dates")
public class Dates {
	
	@Id
	private String id;
	
	@Field(value="Title:")
	private String title;
	
	private Date date;
	
	@Field(value = "Date:")
	private String dateForm;
	
	public Dates(String title, String dateForm) {
		this.title = title;
		this.dateForm = dateForm;
	}
	
	public String getTItle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = new Date();
	}
	
	public String getDateForm() {
		return dateForm;
	}
	
	public void setDateForm(String dateForm) {
		Date date = new Date();
		DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.dateForm = dateF.format(date);
	}

	@Override
	public String toString() {
		return "Dates [date=" + date + ", dateForm=" + dateForm + "]";
	}
}