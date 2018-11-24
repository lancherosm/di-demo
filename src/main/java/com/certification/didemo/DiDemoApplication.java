package com.certification.didemo;

import com.certification.didemo.controllers.ConstructorInjectedController;
import com.certification.didemo.controllers.GetterInjectedController;
import com.certification.didemo.controllers.MyController;
import com.certification.didemo.controllers.PropertyInjectedController;
import com.certification.didemo.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		/**
		 * The ApplicationContext is the central interface within a Spring
		 * application for providing configuration information to the application.
		 */
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		System.out.println(ctx.getBean(MyController.class).hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
