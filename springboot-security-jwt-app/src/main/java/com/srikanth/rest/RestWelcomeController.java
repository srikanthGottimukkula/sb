package com.srikanth.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWelcomeController {

	@GetMapping
	public String welcome() {
		return "<h2>Welcome to Spring Security JWT token !!!<h2>";
	}

}