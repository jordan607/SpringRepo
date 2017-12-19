package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("flipkart")
public class Flipkart {
	@Resource(name="dtdc")
	private Courier courier;

	public String Shopping(String items[]){
		Random random=null;
		int orderId=0;
		//generate orderid
		random=new Random();
		orderId=random.nextInt(1999);
		//deliver products
		System.out.println(courier.deliver(orderId));
		return Arrays.toString(items)+" are delivered ";
	}

}
