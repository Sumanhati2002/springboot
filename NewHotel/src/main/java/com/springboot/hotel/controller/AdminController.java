package com.springboot.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
 
	@RequestMapping("adminform")
	public String showAdmin() {
		
		return "admin";
	}
}
