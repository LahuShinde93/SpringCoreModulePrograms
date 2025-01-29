package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements ICourier {

	@Override
	public String order(int oid) {
return "Order is given to BlueDart Courier Servic with "+oid+" order id";

	}

}
