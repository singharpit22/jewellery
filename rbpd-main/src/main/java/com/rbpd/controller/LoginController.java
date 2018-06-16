package com.rbpd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbpd.bean.HttpResponse;
import com.rbpd.bean.LoginCredentials;
import com.rbpd.service.OwnerService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private OwnerService ownerService;

	/*
	 * @RequestMapping(method=RequestMethod.POST) public String
	 * validateOwner(@RequestParam("userName") String
	 * userName, @RequestParam("password") String password) { return
	 * this.ownerService.validateOwner(userName, password); }
	 */

	@RequestMapping(method = RequestMethod.POST)
	public HttpResponse validateOwner(@RequestBody LoginCredentials loginCredentials) {
		LOGGER.info("Validating owner credential ");
		HttpResponse httpResponse = new HttpResponse(); 
		httpResponse.setStatus(ownerService.validateOwner(loginCredentials.getUserName(), loginCredentials.getPassword()));
		return httpResponse;
	}

}
