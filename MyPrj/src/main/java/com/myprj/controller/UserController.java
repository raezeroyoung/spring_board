package com.myprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	//get은 db의 데이터를 바꾸지 않을거다!
	//post,put,delete는 db의 데이터 바꿀거다
	@GetMapping("signUp")
	public String signUp() {
		return "user/signUp";
	}
	
	
	
	@GetMapping("login")
	public String login() {
		return "user/login";
	}
	
	
	
}
