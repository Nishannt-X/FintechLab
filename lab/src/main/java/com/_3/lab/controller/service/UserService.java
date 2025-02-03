package com._3.lab.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._3.lab.entity.User;
import com._3.lab.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers() {
	return userRepository.findAll();
	}
	public User saveUser(User user) {
	return userRepository.save(user);
	}
}
