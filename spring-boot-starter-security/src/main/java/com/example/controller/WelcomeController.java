package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@GetMapping("/")
	public String home1() {
		System.out.println("home came ------->");
		return "/home";
	}

	@GetMapping("/home")
	public String home() {
		return "/home";
	}

	@GetMapping("/admin")
	public String admin() {
		return "/admin";
	}

	@GetMapping("/user")
	public String user() {
		return "/user";
	}

	@GetMapping("/about")
	public String about() {
		return "/about";
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("login came ------->");
		return "/login";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}
}
