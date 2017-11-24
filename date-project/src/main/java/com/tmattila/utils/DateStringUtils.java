package com.tmattila.utils;

public enum DateStringUtils {

	HEADER_TEXT("Welcome to date storage application "),
	BUTTON_TEXT("Click to save the time of button press to database"),
	DATE_TEXT("Date and time of button press: ");
	
	private final String string;
	
	private DateStringUtils(final String string) {
		this.string = string;
	}
	
	public String getString() {
		return string;
	}
}