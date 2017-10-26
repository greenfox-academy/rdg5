package com.greenfox.rdg5.messageservice;

import com.greenfox.rdg5.messageservice.configuration.MessageProceeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

      @Autowired
      MessageProceeder messageProceeder;

			public static void main(String[] args) {
				SpringApplication.run(MessageserviceApplication.class, args);
			}

			@Override
			public void run(String... args) throws Exception {
        messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
			}

	}

