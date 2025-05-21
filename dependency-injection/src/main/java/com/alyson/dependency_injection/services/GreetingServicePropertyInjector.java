package com.alyson.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjector implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Property injection here!";
    }
}
