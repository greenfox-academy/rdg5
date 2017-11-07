package com.greenfox.rdg5.backend.controller;

import com.greenfox.rdg5.backend.model.Appendee;
import com.greenfox.rdg5.backend.model.Greeting;
import com.greenfox.rdg5.backend.model.NumberDoubled;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling")
  public NumberDoubled doubling(@RequestParam(value = "input") int input) {
    NumberDoubled nd = new NumberDoubled(input);
    return nd;
  }

  @GetMapping(value = "/greeter")
  public Greeting greeting(@RequestParam(value = "name") String name,
      @RequestParam(value = "title") String title) {
    Greeting greet = new Greeting("Oh, hi there " + name + ", my dear " + title + "!");
    return greet;
  }

  @RequestMapping(value = "/appenda/{appendable}")
  public Appendee appending(@PathVariable String appendable) {
    Appendee ap = new Appendee(appendable);
    return ap;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public hendlarOrrer handleMissingParams(MissingServletRequestParameterException ex) {
    String name = ex.getParameterName();
    return new hendlarOrrer("Please provide a " + name + "!");
  }


}
