package com.greenfox.rdg5.messageservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.greenfox.rdg5.messageservice.service.EmailService;
import com.greenfox.rdg5.messageservice.service.MessageService;
import com.greenfox.rdg5.messageservice.service.TwitterService;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService email() {
    return new EmailService();
  }


  public MessageService twitter() {
    return new TwitterService();
  }


  public MessageProceeder proceeder() {
    return new MessageProceeder();
  }

}
