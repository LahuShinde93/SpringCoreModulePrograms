package com.nt.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
@ImportResource("classpath:com/nt/cfg/applicationContext.xml")
public class AppConfig {
}
