package com.purplemango.gms.listener;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SystemTypeListener {

    public void onSystemTypeCreated(@Payload String record) {
        // Handle system type creation logic here
        if (record != null && record.length() > 0) {
            System.out.println("System type created: " + record);
        }
    }
}
