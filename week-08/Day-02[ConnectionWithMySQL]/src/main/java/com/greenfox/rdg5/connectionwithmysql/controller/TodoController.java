package com.greenfox.rdg5.connectionwithmysql.controller;

import com.greenfox.rdg5.connectionwithmysql.model.Todo;
import com.greenfox.rdg5.connectionwithmysql.repository.TodoRepository;
import java.nio.file.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping(value = "/add")
  public String addTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String saveTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/edit")
  public String edit(Model model, @PathVariable("id") Long id) {
    model.addAttribute("todo", todoRepository.findOne(id));
    return "edit";
  }

  @PostMapping(value = "/{id}edit")
  public String saveEdited(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String removeTodo(@PathVariable("id") Long id) {
    todoRepository.delete(id);
    return "redirect:/todo/";
  }

}