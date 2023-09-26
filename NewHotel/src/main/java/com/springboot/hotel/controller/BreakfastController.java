package com.springboot.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BreakfastController {

	@GetMapping("breakfast")
	public String showBreakfast() {
		
		return "breakfast";
	}
}
