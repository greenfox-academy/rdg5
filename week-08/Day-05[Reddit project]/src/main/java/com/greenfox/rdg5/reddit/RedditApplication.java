package com.greenfox.rdg5.reddit;

import com.greenfox.rdg5.reddit.model.Post;
import com.greenfox.rdg5.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication{

  @Autowired
  PostRepository repo;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

}
