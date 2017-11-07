package com.greenfox.rdg5.backend.controller;

import com.greenfox.rdg5.backend.model.NumberDoubled;
import java.io.FileNotFoundException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling")
  public NumberDoubled doubling(@RequestParam(value = "input") int input) {
    NumberDoubled nd = new NumberDoubled(input);
    return nd;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHandler errorhandling() {
    return new ErrorHandler("Please provide an input!");
  }
}
