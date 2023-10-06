package com.springboot.userservice.service;

import java.util.List;

import com.springboot.userservice.enntity.User;

public interface UserService {

	//create user
	User saveUser(User user);
	
	//get all user
	List<User> getAllUsers();
	
	//get by id
	User getById(String id);
}
