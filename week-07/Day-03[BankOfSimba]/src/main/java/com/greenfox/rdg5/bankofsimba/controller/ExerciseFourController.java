package com.greenfox.rdg5.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ExerciseFourController {

  @RequestMapping("/exercise4")
  public String print(Model model) {
    String test = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("test", test);
    return "exercise4";
  }
}

