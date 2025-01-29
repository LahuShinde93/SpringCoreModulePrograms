package com.nt.MainClass;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
 
public class Spring_I18nTest { 

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//read language code and country from the End-user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the language : ");
		String lang = sc.nextLine();
		
		System.out.println("Enter thee country code : ");
		String country =  sc.nextLine();
		
		//prepare Locale obj having language code + country
		//Locale locale = new Locale(lang,country); //Deprecated in java 19
		Locale locale = Locale.of(lang,country); // alternate
		//read message form the Local specific properties file using using the ctx.getMessage(-) method
		
		String msg1 = ctx.getMessage("welcome.msg", new Object[] {"raja"},locale);
		String msg2 = ctx.getMessage("goodbye.msg", new Object[] {},locale);
		String msg3 = ctx.getMessage("application.title", new Object[] {},locale);
		String msg4 = ctx.getMessage("wish.message", new Object[] {},locale);
		
		//Display the messages
		System.out.println(msg1+"------"+msg2+"------"+msg3+"----"+msg4);
		
		//close the container
		ctx.close();
		sc.close();
		
		
		
	}

}
