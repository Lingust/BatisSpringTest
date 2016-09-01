package com.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.domain.User;
import com.chen.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String greeting() {
		return "Hello World!!";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(String name,String password) {
		User user = userService.getUserByName(name);
		if(user.getPassword().equals(password)) {
			return "Login Success";
		}
		return "please Login";
	}

}
