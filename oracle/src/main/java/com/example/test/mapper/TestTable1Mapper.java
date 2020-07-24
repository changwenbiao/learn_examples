package com.example.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.pojo.TestTable1DTO;

@Mapper
public interface TestTable1Mapper {

	void saveTestTable1(TestTable1DTO testTable1DTO);
}
