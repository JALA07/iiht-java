package com.springboot.studentdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WelcomeController {
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	 public String index()
	 {
		 return "index";
		 
	 }
	
}
