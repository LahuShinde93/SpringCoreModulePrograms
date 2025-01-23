package com.nt.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig6 {

	@Bean(name="ldate")
	public LocalDate getLocalDate() {
		return LocalDate.now();
	}
	
}
