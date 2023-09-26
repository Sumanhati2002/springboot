package com.springboot.microservice.service;

import java.util.List;

import com.springboot.microservice.enntity.User;

public interface UserService {

	//create user
	User saveUser(User user);
	
	//get all user
	List<User> getAllUsers();
	
	//get by id
	User getById(int id);
}
