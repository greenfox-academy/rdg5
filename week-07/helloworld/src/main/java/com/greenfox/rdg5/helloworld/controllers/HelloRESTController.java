package com.greenfox.rdg5.helloworld.controllers;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;


@RestController

public class HelloRESTController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting g = new Greeting(counter.incrementAndGet(), "Hello " + name);
    return g;
  }


}
