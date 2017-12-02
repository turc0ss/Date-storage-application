package com.tmattila.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmattila.model.Dates;
import com.tmattila.repository.DateRepository;
import com.tmattila.utils.DateStringUtils;
import com.tmattila.utils.LoggingMessages;

@Service
public class DateServiceImpl implements DateService {

	private static final Logger logger = LogManager.getLogger(DateServiceImpl.class);
	
	@Autowired
	DateRepository dateRepository;
	
	@Override
	public final void saveDateToRepository(final Dates dateDAO) {
		
		logger.debug(LoggingMessages.SAVEDATETOREPOSITORY_ENTER.getString());
		
		Dates dates = new Dates();
		logger.info(LoggingMessages.DATES_OBJECT_CREATED.getString());
		dates.setTitle(DateStringUtils.DATE_TITLE.getString());
		dates.setFormattedDate(dateDAO.getFormattedDate());
		logger.info(dates.toString());
		dateRepository.save(dates);
		
		logger.debug(LoggingMessages.SAVEDATETOREPOSITORY_EXIT.getString());
	}
}
