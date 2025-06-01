package com.srikanth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@GetMapping("/")
	public String getData() {
		return "Hello welcome All!!!";
	}

	@GetMapping("/watch")
	public String getWatch() {
		return "please watch this movie!!!";
	}

	@GetMapping("/premium")
	public String getPremium() {
		return "welcome to Kalki Movie!!!";
	}

	@GetMapping("/about")
	public String getAbout() {
		return "This movie under the govt!!";
	}

}
