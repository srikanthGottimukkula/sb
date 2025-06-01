package com.srikanth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/")
	public String welcome() {
		return "<h2>Hello welcome page !!!<h2>";
	}

}
