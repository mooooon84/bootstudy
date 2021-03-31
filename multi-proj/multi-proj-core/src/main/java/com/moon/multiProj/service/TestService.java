package com.moon.multiProj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.multiProj.model.Test;
import com.moon.multiProj.repository.TestRepository;

@Service
public class TestService {
	@Autowired
	TestRepository testRepository;
	
	public List<Test> selectTestList() {
		return testRepository.selectTestList();
	}
}
