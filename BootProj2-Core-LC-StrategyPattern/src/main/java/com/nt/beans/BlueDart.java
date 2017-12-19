package com.nt.beans;

import javax.inject.Named;

@Named("blueDart")
public class BlueDart implements Courier {

	@Override
	public final String deliver(int orderId) {
		return "BluerDart:delevering order with OrderId:"+orderId;
	}

}
