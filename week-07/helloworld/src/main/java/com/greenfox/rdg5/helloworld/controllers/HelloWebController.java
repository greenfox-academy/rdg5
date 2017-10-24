package com.greenfox.rdg5.helloworld.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

  AtomicLong counter = new AtomicLong();

  @ResponseBody
  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam("name")  String name) {
    Greeting g = new Greeting(counter.incrementAndGet(), "Hello, " + name);
    return g.content + "This site was loaded " + g.id + " times since last servers start.";
  }
}

