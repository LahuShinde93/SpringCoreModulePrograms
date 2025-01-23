package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.configuration.AppConfig07;

public class Task07MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig07.class);
		WishMessageGenerator wishMsg = ctx.getBean("wmg",WishMessageGenerator.class);
		String result = wishMsg.generateWishMessage("Lahu Shinde");
		System.out.println(result);
		ctx.close();
		
	}

}
