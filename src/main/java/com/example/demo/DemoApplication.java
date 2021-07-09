package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	
	public static Logger logger =LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("application started...............");
	}

	public static void main(String[] args) {
		
		
		logger.info("application executed...............");
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("hello world");
	}

}