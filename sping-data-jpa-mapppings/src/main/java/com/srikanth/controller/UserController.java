package com.srikanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.dto.UserRequest;
import com.srikanth.model.User;
import com.srikanth.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody UserRequest request) {
		User saveUser = this.userService.createUserWithProfile(request.getUsername(), request.getEmail(),
				request.getPhone());
		return ResponseEntity.ok(saveUser);

	}

}
