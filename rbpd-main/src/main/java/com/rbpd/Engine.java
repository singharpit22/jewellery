package com.rbpd;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;

import com.rbpd.core.Customer;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class Engine implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(Engine.class, args);
		Customer customer = new Customer();
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		Engine.applicationContext = applicationContext;
	}

}
