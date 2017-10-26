package com.greenfox.rdg5.helloworld;

import config.HelloWorldConfig;
import config.MyColorConfig;
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

    AnnotationConfigApplicationContext pista = new AnnotationConfigApplicationContext(
        MyColorConfig.class);

    MyColor myColor = pista.getBean(Red.class);
    myColor.printColor();

    MyColor myColor1 = pista.getBean(Black.class);
    myColor1.printColor();



  }
}
