package com.springboot.hotel.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.hotel.entity.Logindata;
import com.springboot.hotel.entity.User;
import com.springboot.hotel.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@PostMapping("loginform")
	public String login(@ModelAttribute Logindata logindata) {
		ArrayList<User> users=(ArrayList<User>) userService.getAllUsers();
		if(users.contains(logindata)) {
			System.out.println("already registerd");
			return "index";
		}
		else {
			return "Signup";
		}
		
	}
}
