package com.tmattila.utils;

public enum LoggingMessages {
	
	START_PROGRAM("Start program"),
	DATE_PRINT("Date created and printed on the browser"),
	DATE_PRINT_ERROR("Something went wrong, error printing date to browser"),
	DATE_PRINT_START("Inside the button press, buildLayout() method."),
	DATE_PRINT_EXIT("Exiting buildLayout()");
	
	private final String string;
	
	private LoggingMessages(final String string) {
		this.string = string;
	}
	
	public String getString() {
		return string;
	}
	
}
