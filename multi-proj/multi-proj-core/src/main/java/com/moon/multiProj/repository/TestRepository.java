package com.moon.multiProj.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.moon.multiProj.model.Test;

@Repository
@Mapper
public interface TestRepository {
	public List<Test> selectTestList();
}
