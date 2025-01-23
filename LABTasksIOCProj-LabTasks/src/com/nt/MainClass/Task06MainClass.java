package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.DatePrinter;
import com.nt.configuration.AppConfig6;

public class Task06MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig6.class);
		DatePrinter dp = ctx.getBean("datePrint",DatePrinter.class);
		dp.printDate();
		ctx.close();
	}
}
