package com.springboot.devtool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	int a=10;
	int b=111;
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		
		return "this is for testing..."+(a+b);
	}
}
