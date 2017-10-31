package com.greenfox.rdg5.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @RequestMapping(value = "/todo")
  public String todo() {

    return "todo";
  }

  @ResponseBody
  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    return "this is my first todo";
  }

}
