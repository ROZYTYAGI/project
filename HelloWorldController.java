package com.niit.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String addAirport() {
		return "addairport";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser() {
		return "airportadded";
	}
	
}
