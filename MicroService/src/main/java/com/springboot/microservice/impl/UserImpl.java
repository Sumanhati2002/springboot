package com.springboot.microservice.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.microservice.enntity.User;
import com.springboot.microservice.exception.ResourceNotFoundException;
import com.springboot.microservice.repository.UserRepo;
import com.springboot.microservice.service.UserService;
@Service
public class UserImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//to generate unique id
		String randomId=UUID.randomUUID().toString();
		user.setId(randomId);
		
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) this.userRepo.findAll();
	}

	@Override
	public User getById(String id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("user with given id is not found on server"));
	}

}
