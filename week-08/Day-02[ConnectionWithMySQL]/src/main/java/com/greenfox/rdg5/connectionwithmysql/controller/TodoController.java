package com.greenfox.rdg5.connectionwithmysql.controller;

import com.greenfox.rdg5.connectionwithmysql.model.Todo;
import com.greenfox.rdg5.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

//  @RequestMapping(value = "/todo")
//  public String todo() {
//
//    return "todoslist";
//  }


  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping(value = "/add")
  public String addTodo(Model model) {
    model.addAttribute("todos", new Todo());
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String saveTodo(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

}