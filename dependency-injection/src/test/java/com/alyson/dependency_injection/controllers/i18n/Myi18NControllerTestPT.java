package com.alyson.dependency_injection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PT")
@SpringBootTest
class Myi18NControllerTestPT {

    @Autowired
    Myi18NController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}