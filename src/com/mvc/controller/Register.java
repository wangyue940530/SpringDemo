package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Register {

	 @RequestMapping("/register")
	 public String login(@RequestParam("username") String username, @RequestParam("password") String password,
	            Model model) {

	        if (username.equals("admin") && password.equals("admin")) {
	            model.addAttribute("username", username);
	            return "/showUser";
	        } else {
	            model.addAttribute("username", username);
	            return "/welcome";
	        }
	    }
}
