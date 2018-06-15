package com.rbpd.dao;

import com.rbpd.core.Order;

public class OrderDaoImpl extends BaseDao<Order, Long> implements OrderDao {

	public OrderDaoImpl(Class<Order> persistanceClass) {
		super(Order.class);
	}

}
