package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
  
@Component("foodFactory")  
public class FoodFactory {

	@Autowired   
	private ApplicationContext context; 
	
	public Food createFood(String type) {
		if(type.equalsIgnoreCase("pizza"))
		return context.getBean("pizza",Pizza.class);
		else if(type.equalsIgnoreCase("burger"))
			return context.getBean("burger",Burger.class);
		else 
			throw new IllegalArgumentException("Invalid food tyep..");
	} 
}
