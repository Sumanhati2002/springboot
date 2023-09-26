package com.springboot.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.hotel.entity.User;
import com.springboot.hotel.service.UserService;

@Controller
public class SignupController {

	@Autowired 
	  private UserService userService;
	@GetMapping("/signup")
	 public String showsignup() {
			
			return "Signup";
		}
	 
		
		  @PostMapping("signupform")
		  public String saveUser(@ModelAttribute User users) {
			  
			  userService.saveUser(users); 
			  return "login";
		  }
		 
	 //api for get all users
		  @RequestMapping("api/allusers")
		  @GetMapping
		    public ResponseEntity<List<User>> getAllUsers(){
		        List<User> users = userService.getAllUsers();
		        return new ResponseEntity<>(users, HttpStatus.OK);
		    }
	
}
