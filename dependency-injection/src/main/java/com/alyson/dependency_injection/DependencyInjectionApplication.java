package com.alyson.dependency_injection;

import com.alyson.dependency_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController controller = context.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());
	}

}
