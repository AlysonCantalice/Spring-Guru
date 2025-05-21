package com.alyson.dependency_injection;

import com.alyson.dependency_injection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutoWired() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		MyController controller = applicationContext.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
