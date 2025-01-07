package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) { 

		System.out.println("DependencyInjectionTest.main(start)");
		
		//create the IOC Container
		
		FileSystemXmlApplicationContext ctx =
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get Target spring Bean class object ref form the IOC Container
		Object obj = ctx.getBean("wmg");
		
		//Type castring
		WishMessageGenerator generator =(WishMessageGenerator) obj;
		
		//invoke the businness method
		String result = generator.generateMessage("Lahu");
		System.out.println(result);
		
		//close the IOC Container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main(end)");
	}

}
