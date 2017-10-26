package com.greenfox.rdg5.helloworld;

import config.HelloWorldConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

		AnnotationConfigApplicationContext feri = new AnnotationConfigApplicationContext(
        HelloWorldConfig.class);

		HelloWorld hello = feri.getBean(HelloWorld.class);
		hello.setMessage("Hello World!");
		hello.getMessage();
	}
}
