package com.nt.beans;

import org.springframework.stereotype.Component;

// Define this class as a Spring-managed bean
@Component("msgService")
public class MessageService {
    public void printMessage() {
        System.out.println("Hello, Spring Core!");
    }
}
