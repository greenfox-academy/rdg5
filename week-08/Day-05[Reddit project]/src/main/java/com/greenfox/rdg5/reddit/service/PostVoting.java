package com.greenfox.rdg5.reddit.service;

import com.greenfox.rdg5.reddit.controller.PostController;
import com.greenfox.rdg5.reddit.model.Post;
import com.greenfox.rdg5.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PostVoting {

  public void upvote(Post post) {
    post.setScore(post.getScore() + 1);
  }

  public void downvote(Post post) {
    post.setScore(post.getScore() - 1);
  }

}
