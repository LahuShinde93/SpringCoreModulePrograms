package com.nt.MainClassesFiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.FoodFactory;
import com.nt.config.AppConfig;

public class MainClasse {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		FoodFactory factory = ctx.getBean("foodFactory",FoodFactory.class);
		String serve = factory.createFood("burger").serve();
		System.out.println(serve);
		ctx.close(); 
	}
}
