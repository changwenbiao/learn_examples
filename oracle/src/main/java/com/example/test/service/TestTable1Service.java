package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.mapper.TestTable1Mapper;
import com.example.test.pojo.TestTable1DTO;

@Service
public class TestTable1Service {
	
	@Autowired
	private TestTable1Mapper testTable1Mapper;
	
	
	@Transactional
	public void saveTestTable1(TestTable1DTO testTable1DTO) {
		testTable1Mapper.saveTestTable1(testTable1DTO);
	}
}
