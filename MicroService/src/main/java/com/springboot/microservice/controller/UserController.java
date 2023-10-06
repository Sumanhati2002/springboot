package com.springboot.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.enntity.User;
import com.springboot.microservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//create
	@PostMapping
	 public ResponseEntity<User> createUser(@RequestBody User user){
	        User savedUser = userService.saveUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }
	 
	 //single user get
	 @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") String id){
	        User user = userService.getById(id);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }
	 
	 //get all users
	 @GetMapping
	    public ResponseEntity<List<User>> getAllUsers(){
	        List<User> users = userService.getAllUsers();
	        return new ResponseEntity<>(users, HttpStatus.OK);
	    }
}
