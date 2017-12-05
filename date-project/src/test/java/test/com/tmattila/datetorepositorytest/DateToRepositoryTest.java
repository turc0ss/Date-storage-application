package test.com.tmattila.datetorepositorytest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tmattila.App;
import com.tmattila.model.Dates;
import com.tmattila.repository.DateRepository;
import com.tmattila.utils.DateStringUtils;
import com.tmattila.utils.LoggingMessages;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DateToRepositoryTest {
	
	private static final Logger logger = LogManager.getLogger(DateToRepositoryTest.class);

	@Autowired
	DateRepository dateRepository;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		logger.debug(LoggingMessages.ENTER_REPOSITORY_TEST.getString());
		Date date = new Date();
		DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedDate = dateF.format(date);
		Dates dates = new Dates();
		dates.setTitle(DateStringUtils.DATE_TEST_TITLE.getString());
		dates.setFormattedDate(formattedDate);
		Assert.assertNotNull(dateRepository.save(dates));
		logger.info(formattedDate);
		logger.info(LoggingMessages.REPOSITORY_TEST_COMPLETE.getString());
		logger.debug(LoggingMessages.EXIT_REPOSITORY_TEST.getString());
	}
}