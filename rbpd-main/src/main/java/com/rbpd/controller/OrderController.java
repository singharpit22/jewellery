package com.rbpd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.core.Order;
import com.rbpd.service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(name= "/save", method=RequestMethod.POST)
	public void addOrder(Order order) {
		orderService.save(order);
	}
	
	@RequestMapping(name="/update", method=RequestMethod.PUT)
	public void updateOrder(Order order) {
		orderService.update(order);
	}
	

}
