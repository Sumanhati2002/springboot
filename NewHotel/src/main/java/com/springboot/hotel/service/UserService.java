package com.springboot.hotel.service;

import java.util.List;

import com.springboot.hotel.entity.User;

public interface UserService {

	//create user
	User saveUser(User user);
	
	//get all users
	List<User> getAllUsers();
	
	//get user by id
	User userById(int id);
	
	//update user
	User updateUser(User user);
	
	//delete user
	void deleteUser(int id);
}
