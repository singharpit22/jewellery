package com.rbpd;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
@ComponentScan(value = "com.rbpd")
public class Engine implements ApplicationContextAware {

	private static final Logger LOGGER = LoggerFactory.getLogger(Engine.class);
	
	private static ApplicationContext applicationContext;

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Engine.class, args);
		LOGGER.info("Application started !!!");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Engine.applicationContext = applicationContext;
	}


}
