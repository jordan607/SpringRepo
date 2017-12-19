package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeViewController {
	
	//@ResponseBody
	@RequestMapping(value="/home.htm")
	public  String showHomePage(){
		return "welcome";
	}

}//class
