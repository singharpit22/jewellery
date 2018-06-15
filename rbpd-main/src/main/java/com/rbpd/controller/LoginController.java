package com.rbpd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.service.OwnerService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(method=RequestMethod.POST)
	public String validateOwner(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		return this.ownerService.validateOwner(userName, password);
	}

}
