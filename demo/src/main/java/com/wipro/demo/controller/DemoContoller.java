package com.wipro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {

	@GetMapping
	public String greetEveryone() {
		return "Have a Good Day";
	}
}