package com.rbpd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbpd.core.Customer;
import com.rbpd.dao.CustomerDao;

@Service
public class CustomerService implements GenericService<Customer> {

	@Autowired
	private CustomerDao customerDao;
	
	public void save(Customer customer) {
		
	}

	public void update(Customer t) {
		// TODO Auto-generated method stub
		
	}

}
