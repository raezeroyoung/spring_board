package com.myprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	//get�� db�� �����͸� �ٲ��� �����Ŵ�!
	//post,put,delete�� db�� ������ �ٲܰŴ�
	@GetMapping("signUp")
	public String signUp() {
		return "user/signUp";
	}
	
	
	
	@GetMapping("login")
	public String login() {
		return "user/login";
	}
	
	
	
}
