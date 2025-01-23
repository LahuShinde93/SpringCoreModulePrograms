package com.nt.MainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.MessageService;
import com.nt.configuration.AppConfig;

public class PrintMessageMain {
    public static void main(String[] args) {
        // Initialize the Spring application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch the MessageService bean and call its method
        MessageService msg = ctx.getBean("msgService", MessageService.class);
        msg.printMessage();

        // Close the application context
        ctx.close();
    } 
}
