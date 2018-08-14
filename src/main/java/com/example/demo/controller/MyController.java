package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/ourservices")
	public String showOurServices() {
		return "ourservices";
	}
	
	@GetMapping("/ourservices/service1")
	public String showService1() {
		return "service1";
	}
	
	@GetMapping("/ourservices/service2")
	public String showService2() {
		return "service2";
	}
	
	@GetMapping("/ourservices/service3")
	public String showService3() {
		return "service3";
	}
	
	@GetMapping("/news")
	public String showNews() {
		return "news";
	}
	
	@GetMapping("/news/today")
	public String showNewsToday() {
		return "today";
	}
	
	@GetMapping("/news/yesterday")
	public String showNewsYesterday() {
		return "yesterday";
	}
	
	@GetMapping("/news/week")
	public String showNewsWeek() {
		return "week";
	}
	
	@GetMapping("/about")
	public String showAbout() {
		return "about";
	}
	
	@GetMapping("/contactus")
	public String showContactUs() {
		return "contactus";
	}
}
