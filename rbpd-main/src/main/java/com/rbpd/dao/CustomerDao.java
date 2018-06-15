package com.rbpd.dao;

import java.util.List;

import com.rbpd.core.Customer;

public interface CustomerDao extends GenericDao<Customer, Long> {
	
	public List<Customer> findCustomerByName(String name);

}
