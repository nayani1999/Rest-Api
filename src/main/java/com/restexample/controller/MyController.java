package com.restexample.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}

}
