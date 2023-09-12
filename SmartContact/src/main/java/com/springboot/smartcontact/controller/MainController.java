package com.springboot.smartcontact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.smartcontact.entity.User;
import com.springboot.smartcontact.repository.UserRepo;

@Controller
public class MainController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user=new User();
		user.setId(0);
		user.setName("suman");
		
		userRepo.save(user);
		return "working";
	}
}
