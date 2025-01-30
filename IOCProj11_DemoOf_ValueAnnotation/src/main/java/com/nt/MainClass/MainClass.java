package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.AppConfig;
import com.nt.beans.PersonalInfo;

public class MainClass { 
   
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonalInfo info = ctx.getBean("info",PersonalInfo.class);
		info.getPersonalInfo();
		ctx.close(); 
		
	}

}
