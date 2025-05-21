package com.alyson.dependency_injection.controllers;

import com.alyson.dependency_injection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectorControllerTest {

    @Autowired
    SetterInjectedController setterInjectorController;

    /*    @BeforeEach
    void setUp() {
        setterInjectorController = new SetterInjectedController();
        setterInjectorController.setGreetingService(new GreetingServiceImpl());
    }*/

    @Test
    void sayHello() {
        System.out.println(setterInjectorController.sayHello());
    }
}