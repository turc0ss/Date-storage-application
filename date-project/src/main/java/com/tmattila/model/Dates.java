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
	private String formattedDate;
	
	public Dates() {
		
	}
	
	public final String getTitle() {
		return title;
	}

	public final void setTitle(final String title) {
		this.title = title;
	}

	public final Date getDate() {
		return this.date;
	}

	public final void setDate(final Date date) {
		this.date = new Date();
	}
	public final String getFormattedDate() {
		return this.formattedDate;
	}

	public final void setFormattedDate(final String formattedDate) {
		Date date = new Date();
		DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.formattedDate = dateF.format(date);
	}

	@Override
	public String toString() {
		return "Dates [title=" + title + ", date=" + formattedDate + "]";
	}
	
}