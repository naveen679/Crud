package com.example.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import org.apache.log4j.loggingLogManager;  
import org.apache.log4j.logging.Logger;  

@SpringBootApplication
public class LoggerApplication {
	
	private static final Logger=LoggerManager.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
		
		
	}

}
