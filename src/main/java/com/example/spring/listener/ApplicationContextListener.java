package com.example.spring.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationContextListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        if (applicationFailedEvent.getException() != null) {
            System.out.println("Failed initialize application context so, closing application context.");
        }else {
            System.out.println("Application context initialize successfully.");
        }
    }
}
