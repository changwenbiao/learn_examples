package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.pojo.TestTable1DTO;
import com.example.test.service.TestTable1Service;

@RestController
@SpringBootApplication
public class OracleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OracleApplication.class, args);
	}
	
	@Autowired
	private TestTable1Service testTable1Service;

	@RequestMapping(value="/saveTestTable1", method=RequestMethod.GET)
	public void saveTestTable1() {
		TestTable1DTO testTable1DTO = new TestTable1DTO();
		testTable1DTO.setTestColumn1("testColumn1");
		testTable1DTO.setTestColumn2("testColumn2");
		testTable1DTO.setTestColumn3("testColumn3");
		testTable1DTO.setTestColumn4("testColumn4");
		testTable1DTO.setTestColumn5("testColumn5");
		testTable1DTO.setTestColumn6("testColumn6");
		testTable1DTO.setTestColumn7("testColumn7");
		testTable1DTO.setTestColumn8("testColumn8");
		testTable1DTO.setTestColumn9("testColumn9");
		testTable1DTO.setTestColumn10("testColumn10");
		testTable1Service.saveTestTable1(testTable1DTO);
	}
}