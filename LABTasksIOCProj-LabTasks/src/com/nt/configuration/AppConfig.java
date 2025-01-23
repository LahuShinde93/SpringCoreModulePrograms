package com.nt.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Mark this class as a configuration class
@Configuration
@ComponentScan(basePackages = "com.nt") // Ensure all packages under "com.nt" are scanned
public class AppConfig {
}
