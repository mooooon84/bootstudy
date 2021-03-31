package com.moon.multiProj.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.moon.multiProj.model.Test;
import com.moon.multiProj.service.TestService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/index")
	public ModelAndView testIndex(ModelAndView model) {
		System.out.println("testIndex loard!!");
			
		List<Test> testList = testService.selectTestList();
		
System.out.println("testList : " + testList);		
		
		model.setViewName("test/test");

		return model;
	}
}