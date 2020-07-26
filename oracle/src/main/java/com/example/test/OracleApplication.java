package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.TestTable1Service;

@RestController
@MapperScan(basePackages = { "com.example.test.mapper" })
@SpringBootApplication
public class OracleApplication {

	private static Logger log = LoggerFactory.getLogger(OracleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OracleApplication.class, args);
	}

	@Autowired
	private TestTable1Service testTable1Service;

	@RequestMapping(value = "/saveTestTable1", method = RequestMethod.GET)
	public void saveTestTable1() {
		log.info("start...");
		testTable1Service.saveTestTable1();
		log.info("end...");
	}
}