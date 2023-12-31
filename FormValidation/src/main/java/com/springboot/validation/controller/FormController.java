package com.springboot.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.validation.entity.User;

import jakarta.validation.Valid;

@Controller
public class FormController {

	@GetMapping("/")
	public String showform(Model model) {
		
		model.addAttribute("user", new User());
		return "Form";
	}
	
	@PostMapping("/processform")
	public String submitform(@Valid @ModelAttribute("user") User user, BindingResult result) {
		
		System.out.println(user);
		if (result.hasErrors()) {
			
			return "Form";
		}
		else {
			return "success";
		}
		
	}
}
