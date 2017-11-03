package com.greenfox.rdg5.reddit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class VoteConfig {


  @Bean
  public PostVoting postVoting() {
    return new PostVoting();
  }

}
