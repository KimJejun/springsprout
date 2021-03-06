package springsprout.service.notification.twitter;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springsprout.service.notification.twitter.TwitterService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/testContext.xml")
public class TwitterServiceTest {

	@Autowired @Qualifier("twitterService") TwitterService service;
	
	@Test
	public void di() throws Exception {
		assertNotNull(service.twitter);
	}
}
