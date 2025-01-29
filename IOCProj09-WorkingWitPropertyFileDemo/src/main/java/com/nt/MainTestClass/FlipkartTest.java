package com.nt.MainTestClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig; 
import com.nt.beans.Flipkart;
 
public class FlipkartTest { 

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart cart = ctx.getBean("fpkt",Flipkart.class);
		String order = cart.makeOrder("Lahu");
		System.out.println(order); 
		ctx.close();  	   
	} 
}
