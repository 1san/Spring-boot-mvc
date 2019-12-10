package com.san.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/home" })
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/profile")
	public String profile() {
		return "profile";
	}
}

