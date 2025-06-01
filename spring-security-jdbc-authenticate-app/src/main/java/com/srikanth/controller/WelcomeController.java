package com.srikanth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String welcome() {
		return "<h2>Hello welcome to Srikanth World!!</h2>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h2>Hello welcome to Admin page!!</h2>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h2>Hello welcome to User page !!</h2>";
	}

}
