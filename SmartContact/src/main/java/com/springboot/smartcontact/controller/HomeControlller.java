package com.springboot.smartcontact.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.smartcontact.entity.User;
import com.springboot.smartcontact.repository.UserRepo;

@Controller
public class HomeControlller {

	@Autowired
	private UserRepo userRepo;
	@GetMapping("/")
	public String showPage() {
			
		return "Home";	
	}
	
	//signup
	@GetMapping("/signup")
	public String showsignup() {
		
		return "signupform";
	}
	
	//after clicking signup
	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String signup(@ModelAttribute User user) {
		
		System.out.println(user);
		this.userRepo.save(user);
		return "Login";
	}
	
	//show login page
	@GetMapping("/login")
	public String showlogin() {
		
		return "Login";
	}
}
