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
import com.springboot.hotel.entity.SendMassege;
import com.springboot.hotel.service.SendMassegeService;


@Controller
public class MainController {

	@Autowired
	private SendMassegeService massegeService;
	
	@RequestMapping("/")
	public String show() {
		
		return "index";
	}
	
	@PostMapping("processform")
	public String saveMassege(@ModelAttribute SendMassege sendMassege) {
		massegeService.saveMassage(sendMassege);
		return "index";
	}
	
	//get all data by api
	@RequestMapping("api/users")
	 @GetMapping
	    public ResponseEntity<List<SendMassege>> getAllMassege(){
	        List<SendMassege> masseges = massegeService.getAllMasseges();
	        return new ResponseEntity<>(masseges, HttpStatus.OK);
	    }
	
	 
	 @GetMapping("/login")
	 public String showLogin() {
			
			return "login";
		}
}




















