package com.nt.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator { 

	@Autowired
	private LocalTime lt; //HAS-A Property
	
	public void setLocalTime(LocalTime lt) {
		this.lt = lt;
	}
	
	public String generateWishMessage(String user) {
		int hour = lt.getHour();
		
		if(hour<12)
			return "Good Morning"+user;
		else if(hour>=12 && hour<16)
			return "Good AfterNoon"+user;
		else if(hour>=16 && hour<20)
			return "Good Evening"+user;
		else if(hour>=20)
			return "Good Night"+user;
		else
			return "Invalid";
	}
	
}
