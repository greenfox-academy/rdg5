package com.greenfox.rdg5.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/")
public class MainController {

  @RequestMapping(value = "/")
  public String getIndex(Model model){
      return "index";
  }

}
