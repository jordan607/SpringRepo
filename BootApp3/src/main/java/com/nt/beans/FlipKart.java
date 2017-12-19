package com.nt.beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipKart")
public class FlipKart {
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	public String shopping(String items[]){
		int billAmt=0;
		int orderId=0;
		String status=null;
		
		billAmt=items.length*1000;
		orderId=new Random().nextInt(100000);
		//deliver product
		  status=courier.deliver(orderId);
		 return "Bill amount"+billAmt+"----->"+status;
	}
}
