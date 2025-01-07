package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime lt; // Has-A property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	// Setter method for setter injection (alt + shift + s,r)
	public void setLt(LocalTime lt) {
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt; 
	}
	
	//business.method
	
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		
		//get current hours of the day
		int hour =lt.getHour();
		
		if(hour<12) 
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good AfterNoon:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
		
	}
	
}
