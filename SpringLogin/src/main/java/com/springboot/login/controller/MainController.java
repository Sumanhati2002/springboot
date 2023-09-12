package com.springboot.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.login.entity.LoginData;
import com.springboot.login.service.LoginService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("api/loginusers")
public class MainController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/")
	public String showform() {

		return "Form";
	}

	@PostMapping("/proccess")
	public String savedata(@ModelAttribute LoginData loginData) {
		System.out.println(loginData);
		this.loginService.createData(loginData);
		return "success";
	}


	// Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<LoginData>> getAllUsers(){
        List<LoginData> users = loginService.getalldata();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
