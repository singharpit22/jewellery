package com.rbpd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbpd.core.Order;
import com.rbpd.dao.OrderDao;

@Service
public class OrderService implements GenericService<Order> {

	@Autowired
	private OrderDao orderDao;

	public void save(Order order) {
		
	}

	public void update(Order t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getAll() {
		return orderDao.findAll();
	}


	
	
	
}
