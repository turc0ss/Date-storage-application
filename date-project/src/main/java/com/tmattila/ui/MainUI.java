package com.tmattila.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tmattila.utils.DateStringUtils;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
@Title("Date Project")
@SpringUI(path="/ui")
public class MainUI extends UI {

	private VerticalLayout rootLayout;
	
	private HorizontalLayout headerLayout;
	
	private HorizontalLayout buttonLayout;
	
	private HorizontalLayout dateMarkings;
	
	private Label headerLabel;
	
	private Button dateButton;
	
	private Date date;
	
	private DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	@Override
	protected void init(VaadinRequest request) {
		
		rootLayout = new VerticalLayout();
		headerLayout = new HorizontalLayout();
		
		headerLabel = new Label("<h2><b>" + DateStringUtils.HEADER_TEXT.getString() + "</b></h2>", ContentMode.HTML);
		headerLayout.addComponent(headerLabel);
		
		buttonLayout = new HorizontalLayout();
		buttonLayout.setMargin(false);
		buttonLayout.setSpacing(false);
		
		dateButton = new Button(DateStringUtils.BUTTON_TEXT.getString());
		dateMarkings = new HorizontalLayout();
		
		dateButton.addClickListener(e -> {
			buildLayout();
		});
		
		buttonLayout.addComponent(dateButton);
		
		rootLayout.addComponent(headerLabel);
		rootLayout.addComponent(buttonLayout);
		setContent(rootLayout);
	}

	private void buildLayout() {
		
		date = new Date();
		String formattedDate = dateF.format(date);
		
		Label timeLabel = new Label("<b>" + DateStringUtils.DATE_TEXT.getString() + " </b>", ContentMode.HTML);
		Label dateLabel = new Label(timeLabel.getValue() + formattedDate, ContentMode.HTML);
		
		dateMarkings.addComponent(dateLabel);
		rootLayout.addComponent(dateLabel);
		
	}
}



