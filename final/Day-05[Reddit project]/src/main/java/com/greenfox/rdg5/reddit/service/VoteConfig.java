package com.greenfox.rdg5.reddit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoteConfig {

  @Bean
  public PostService postVoting() {
    return new PostService();
  }

}
