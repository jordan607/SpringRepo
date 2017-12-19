package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wish")
public class WishMessageGeneratorService {
   
	public  String generateWishMessage(String name){
		 Calendar calendar=null;
		 int hour=0;
		 //get Instance
		 calendar=Calendar.getInstance();
		 //get curent hour of the day
		 hour=calendar.get(Calendar.HOUR_OF_DAY);
		 //generate wish Message
		 if(hour<=12)
			 return "GM:"+name;
		 else if(hour<=16)
			 return "GA:"+name;
		 else if(hour<=20)
			 return "GE"+name;
		 else 
			 return "GN:"+name;
	}//method
}//class
