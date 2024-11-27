package com.cjc.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController 
{
	private static final Logger log =LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String defaultRequest()
	{
		log.error("this is erroe Event");
		log.warn("this is warn Event");
		log.info("this is info Event");
		log.debug("this is debug Event");
		return "Plz check the Console";
	}
}
