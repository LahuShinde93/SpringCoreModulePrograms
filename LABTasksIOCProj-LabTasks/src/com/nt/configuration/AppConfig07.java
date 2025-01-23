package com.nt.configuration;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig07 {

	@Bean(name="lt")
	public LocalTime getLocalTime() {

		return LocalTime.now();
	}
}
