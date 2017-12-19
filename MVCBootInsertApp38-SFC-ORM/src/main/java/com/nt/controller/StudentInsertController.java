package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

@Controller
public class StudentInsertController {
	@Autowired
	 private StudentInsertService service;

	@RequestMapping(value="/register.htm",method=RequestMethod.GET)
	public String showHomePage(@ModelAttribute("stCmd") StudentCommand cmd){
		return "register";
		
	}
	
	@RequestMapping(value="/register.htm",method=RequestMethod.POST)
	public  String  processForm(Map<String,Object> map,@ModelAttribute("stCmd") StudentCommand cmd){
		 StudentDTO dto=null;
		 String status=null;
          //Convert Cmd to DTO
		 dto=new StudentDTO();
		 BeanUtils.copyProperties(cmd, dto);
		 //use servce
		 status=service.registerStudent(dto);
		 //put result in Model 
		 map.put("result",status);
		 return "register";
		 
	}
}
