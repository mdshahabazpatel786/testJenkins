package com.example.spring.jenkins.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemo1Application {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemo1Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDemo1Application.class, args);
		logger.info("SpringJenkinsDemo1Application --- main");
	}
	
	public void start()
	{
		logger.info("SpringJenkinsDemo1Application --- start");
	}

}
