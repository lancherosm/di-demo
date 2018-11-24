package com.certification.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello I am the original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}


