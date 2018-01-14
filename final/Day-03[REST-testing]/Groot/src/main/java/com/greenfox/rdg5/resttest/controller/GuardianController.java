package com.greenfox.rdg5.resttest.controller;

import com.greenfox.rdg5.resttest.model.Grootling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public Object grootling(@RequestParam(value = "received" , required =  false) String somemessage) {
    if (somemessage == null) {
      return new ErrorResponse("I am Groot!");
    } else {
      return new Grootling(somemessage);
    }
  }

  @Get

}
