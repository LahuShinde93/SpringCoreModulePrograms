package com.nt.beans;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

    @Autowired
    @Qualifier("shipment") // Use alias name
    private ICourier courier; // HAS-A Property

    public String makeOrder(String user) {
        int oid = new Random().nextInt(1000);
        String msg = courier.order(oid);
        return user + " Your Order is booked " + msg;
    }
}
