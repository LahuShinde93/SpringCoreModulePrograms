package com.nt.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
@PropertySource("com/nt/Commons/MyInfo.properties")
public class AppConfig {

}
