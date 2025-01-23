package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Greeting;
import com.nt.configuration.ApplicationConfig;

public class Task03MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Greeting msg = ctx.getBean("greeting",Greeting.class);
		msg.greetUser("Lahu Shinde");
	}

}
