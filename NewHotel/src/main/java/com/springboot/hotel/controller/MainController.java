package com.springboot.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.hotel.entity.SendMassege;
import com.springboot.hotel.repo.SendMassegeRepo;

@Controller
public class MainController {

	@Autowired
	private SendMassegeRepo sendMassegeRepo;
	
	@RequestMapping("/")
	public String show() {
		
		return "index";
	}
	
	@PostMapping("processform")
	public String sendmassage(@ModelAttribute("sendMassege") SendMassege sendMassege) {
		System.out.println(sendMassege);
		this.sendMassegeRepo.save(sendMassege);
		return "index";
	}
}
