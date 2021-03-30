package com.moon.multiProj.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("/index")
	public ModelAndView testIndex(ModelAndView model) {
		System.out.println("testIndex loard!!");
		
		model.setViewName("test/test");

		return model;
	}
}