package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {
	
	@RequestMapping("/")
	ModelAndView home() {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home.jsp");
		
		return m;
	}

}
