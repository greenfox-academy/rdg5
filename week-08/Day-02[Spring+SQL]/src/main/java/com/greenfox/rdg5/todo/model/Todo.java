package com.greenfox.rdg5.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public Todo(String title) {
    this.title = title;

  }

  public Todo() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
