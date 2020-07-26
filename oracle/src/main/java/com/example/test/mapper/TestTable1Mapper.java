package com.example.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTable1Mapper { 
	void saveTestTable1(/** List<TestTable1DTO> testTable1DTO */);
}
