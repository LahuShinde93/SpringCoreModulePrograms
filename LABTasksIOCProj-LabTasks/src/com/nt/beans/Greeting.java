package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("greeting")
public class Greeting {

	String userName;
	
	public void greetUser(String userName) {
		System.out.println("Hello, "+userName+"!");
	}
}
