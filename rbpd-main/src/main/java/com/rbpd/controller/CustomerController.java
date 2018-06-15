package com.rbpd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.core.Customer;
import com.rbpd.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void addCustomer(Customer customer) {
		customerService.save(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateCustomer(Customer customer) {
		customerService.update(customer);
	}

}
