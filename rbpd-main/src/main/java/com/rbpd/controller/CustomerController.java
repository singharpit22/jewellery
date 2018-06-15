package com.rbpd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.core.Customer;
import com.rbpd.service.CustomerService;

@RestController(value = "/customer")
public class CustomerController {
	
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void add(Customer customer) {
		customerService.save(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void update(Customer customer) {
		customerService.update(customer);
	}

}
