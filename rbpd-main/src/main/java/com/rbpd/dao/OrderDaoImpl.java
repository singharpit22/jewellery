package com.rbpd.dao;

import org.springframework.stereotype.Component;

import com.rbpd.core.Order;

@Component
public class OrderDaoImpl extends BaseDao<Order, Long> implements OrderDao {
	
	public OrderDaoImpl() {
		super(Order.class);
	}

}
