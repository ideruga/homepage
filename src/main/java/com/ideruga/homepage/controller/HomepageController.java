package com.ideruga.homepage.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("/")
public class HomepageController {

//	@RequestMapping(value="/homepage", produces="application/json")
//	public String test() {
//		return "Success!";
//	}

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}
