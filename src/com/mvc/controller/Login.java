package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class Login  {

	 public Login() {}  
	/* @RequestMapping(value = "/login/{user}", method = RequestMethod.GET)  
	 public ModelAndView myMethod(HttpServletRequest request,HttpServletResponse response,   
	            @PathVariable("user") String user, ModelMap modelMap) throws Exception {  
	      modelMap.put("loginUser", user);  
	      return new ModelAndView("/login/showUser", modelMap);  
	 }  */
	 @RequestMapping("/login")
	 public String login(@RequestParam("username") String username, @RequestParam("password") String password,
	            Model model) {

	        if (username.equals("admin") && password.equals("admin")) {
	            model.addAttribute("username", username);
	            model.addAttribute("password", password);
	            return "/showUser";
	        } else {
	            model.addAttribute("username", username);
	            model.addAttribute("password", password);
	            return "/welcome";
	        }
	    }
}
