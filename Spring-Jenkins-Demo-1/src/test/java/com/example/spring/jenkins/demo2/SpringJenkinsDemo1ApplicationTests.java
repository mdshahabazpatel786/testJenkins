package com.example.spring.jenkins.demo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemo1ApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemo1ApplicationTests.class);
	
	@Test
	void contextLoads() {
		
		assertEquals(true, true);
		logger.info("SpringJenkinsDemo1Application --- contextLoads");
	}

}
