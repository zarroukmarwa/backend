package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder; 
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		String password = user.getPassword();
		user.setPassword(bcryptPasswordEncoder.encode(password));
		return userRepository.save(user);
	}


	
}
