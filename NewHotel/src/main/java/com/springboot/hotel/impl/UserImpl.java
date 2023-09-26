package com.springboot.hotel.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hotel.entity.User;
import com.springboot.hotel.repo.UserRepo;
import com.springboot.hotel.service.UserService;

@Service
public class UserImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		Optional<User> user=userRepo.findById(id);
		return user.get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(id);
	}

}
