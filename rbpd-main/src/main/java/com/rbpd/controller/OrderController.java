package com.rbpd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.core.Order;
import com.rbpd.service.OrderService;

@RestController(value = "/order")
public class OrderController {
	
	private OrderService orderService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void add(Order order) {
		orderService.save(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void update(Order order) {
		orderService.update(order);
	}
	

}
