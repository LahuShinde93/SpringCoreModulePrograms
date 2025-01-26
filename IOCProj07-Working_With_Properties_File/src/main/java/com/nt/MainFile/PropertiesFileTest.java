package com.nt.MainFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.beans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo info = ctx.getBean("pInfo",PersonInfo.class);
	
				System.out.println(info);
	}
 
}
