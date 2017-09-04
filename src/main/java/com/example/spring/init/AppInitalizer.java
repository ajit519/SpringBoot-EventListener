package com.example.spring.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInitalizer implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        throw new RuntimeException("Throwing exception explicitly");
    }
}
