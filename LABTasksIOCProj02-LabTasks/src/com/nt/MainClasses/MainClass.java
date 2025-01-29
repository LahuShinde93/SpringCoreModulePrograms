package com.nt.MainClasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.beans.ShapeFactory;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
		ShapeFactory factory = ctx.getBean("shapeFactory",ShapeFactory.class);
		
		factory.createShape("sqr").draw();
		ctx.close();
		
	}

}
