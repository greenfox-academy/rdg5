package com.greenfox.rdg5.reddit.controller;

import com.greenfox.rdg5.reddit.model.Post;
import com.greenfox.rdg5.reddit.repository.PostRepository;
import com.greenfox.rdg5.reddit.service.PostVoting;
import com.greenfox.rdg5.reddit.service.VoteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/reddit")
public class PostController {

  @Autowired
  PostRepository repo;

  @Autowired
  PostVoting voting;


  @RequestMapping(value = "/")
  public String list(Model model) {
    model.addAttribute("post", repo.findAll());
    return "reddit";
  }

  @GetMapping(value = "/add")
  public String addPost(Model model) {
    model.addAttribute("post", new Post());
    return "addpost";
  }

  @PostMapping(value = "/add")
  public String savePost(@ModelAttribute Post post) {
    repo.save(post);
    return "redirect:/reddit/";
  }

  @GetMapping(value = "/{id}/upvote")
  public String upvote(@PathVariable long id) {
    Post p = repo.findOne(id);
    voting.upvote(p);
    repo.save(p);
    return "redirect:/reddit/";
  }

  @GetMapping(value = "/{id}/downvote")
  public String downvote(@PathVariable long id) {
    Post p = repo.findOne(id);
    voting.downvote(p);
    repo.save(p);
    return "redirect:/reddit/";
  }

}
