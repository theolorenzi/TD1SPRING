package com.inti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld(@RequestParam("nom") String n) {
		return "Bonjour " + n;
	}
	

}
