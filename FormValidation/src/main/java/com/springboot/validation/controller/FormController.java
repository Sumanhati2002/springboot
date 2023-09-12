package com.springboot.validation.controller;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.validation.entity.User;

import jakarta.validation.Valid;

@Controller
public class FormController {

	@GetMapping("/")
	public String showform() {
		
		return "Form";
	}
	
	@PostMapping("/processform")
	public String submitform(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		System.out.println(user);
		if (result.hasErrors()) {
			
			return "Form";
		}
		return "success";
	}
}
