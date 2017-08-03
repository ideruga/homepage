package com.ideruga.homepage.controller.cv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CVController {
	@RequestMapping(value="/cv", method = RequestMethod.GET)
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cv/index");
		return mv;
	}
}
