package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Calculator;
import com.nt.configuration.AppConfig3;

public class Task04MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
		Calculator calculate = ctx.getBean("calculate",Calculator.class);
		System.out.println("Addition is : "+calculate.add(10, 20));
		System.out.println("subtraction is : "+calculate.sub(10, 20));
		System.out.println("multiplication is : "+calculate.multiplicatio(10, 20));
		System.out.println("Division is : "+calculate.div(10, 20));
		
	}

}
