package com.greenfox.rdg5.helloworld.controllers;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("name") String name) {
    Greeting g = new Greeting(1, "Hello " + name);
    return g;
  }


}
