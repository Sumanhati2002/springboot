package com.springboot.thymleaf.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(org.springframework.ui.Model model) {
		
		System.out.println("this is about page");
		model.addAttribute("name", "suman");
		return "About";
	}
	
	//handling iteration
	@GetMapping("/itarate")
	public String iteration(Model model) {
		
		List<String> list = List.of("A","B","C","D");
		model.addAttribute("list", list);
		return "Iterate";
	}
	
	//handler for conditional statement
	@GetMapping("/condition")
	public String condition(Model model) {
		
		model.addAttribute("isActive", true);
		model.addAttribute("gender", "F");
		return "Condition";
	}
	
	//handler for including fragment
	@GetMapping("/service")
	public String seviceHandler(Model m) {
		
		return "Service";
	}
	
	//for newabout
	@GetMapping("/newAbout")
	public String newAbout() {
		return "NewAbout";
	}
	}





















