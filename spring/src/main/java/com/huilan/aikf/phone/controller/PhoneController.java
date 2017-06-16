package com.huilan.aikf.phone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.huilan.aikf.phone.domain.PhoneApp;
import com.huilan.aikf.phone.service.PhoneAppService;

@RestController
@RequestMapping("/phone")
public class PhoneController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private PhoneAppService phoneAppService;
	
	@RequestMapping(value="/addUserWithBackId", method = RequestMethod.GET)
	public String addUserWithBackId(@RequestParam("id") String id) {
		logger.trace("I am trace log.");  
        logger.debug("I am debug log.");  
        logger.warn("I am warn log.");  
        logger.error("I am error log.");   
		PhoneApp app = phoneAppService.getPhoneApp("8a216da854eb9c020154ebae3d010011");
		System.out.println(app.getAPPID());
		return "Hello";
	}
	
	@RequestMapping(value = "/getApp", method = RequestMethod.GET)
	@ResponseBody
	public PhoneApp loginUser() {
		logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.");
		return phoneAppService.getPhoneApp("8a216da854eb9c020154ebae3d010011");
	}
}
