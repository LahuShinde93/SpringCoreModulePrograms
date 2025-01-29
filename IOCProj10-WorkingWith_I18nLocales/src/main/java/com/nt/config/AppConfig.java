package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration 
public class AppConfig {

	//messageSource is the fixed bean id
	@Bean(name="messageSource")
	public ResourceBundleMessageSource createRMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/nt/Commons/App");
		return source;
	}
}
