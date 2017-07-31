package com.ideruga.homepage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

//	@RequestMapping(value="/homepage", produces="application/json")
//	public String test() {
//		return "Success!";
//	}

	@RequestMapping(value="/test")
	public String homepage() {
		return "Success 3!";
	}
}
