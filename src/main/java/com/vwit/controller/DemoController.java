package com.vwit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	//http://localhost:9090/welcome?tech=java&exp=9
	// this is old and not recommended style of fetching request parameters
	@GetMapping("/welcome")
	public String hello(HttpServletRequest req) {
		System.out.println("I am in controller");
		String name=req.getParameter("tech");
		int exp=Integer.parseInt(req.getParameter("exp")); //everything passed from client in the request is string
		System.out.println("my "+name+" experience is "+exp+" years");
		
		return "hello";
	}
	//new Approach to fetching request parameters
	// @RequestParam is used to 
	@GetMapping("/profile")
	public String helloNewStyle(@RequestParam(name="tech",required=false)String name,@RequestParam int exp) {
		System.out.println("I am in controller");
		System.out.println("my "+name+" experience is "+exp+" years");
		
		return "hello";
	}

}






















