package com.srikanth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikanth.model.Profile;
import com.srikanth.model.User;
import com.srikanth.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUserWithProfile(String username, String email, String phone) {
		User user = new User();
		user.setUsername(username);

		Profile profile = new Profile();
		profile.setEmail(email);
		profile.setPhoneno(phone);

		user.setProfile(profile); // Link the Profile to the User
		return userRepository.save(user); // Save both User and Profile
	}
}
