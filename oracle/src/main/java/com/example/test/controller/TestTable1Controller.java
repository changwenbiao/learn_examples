package com.example.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.TestTable1Service;

@RestController
public class TestTable1Controller {
	
	private static Logger log = LoggerFactory.getLogger(TestTable1Controller.class);
	
	@Autowired
	private TestTable1Service testTable1Service;

	@RequestMapping(value = "/saveTestTable1", method = RequestMethod.GET)
	public void saveTestTable1() {
		log.info("start...");
		testTable1Service.saveTestTable1();
		log.info("end...");
	}
}
