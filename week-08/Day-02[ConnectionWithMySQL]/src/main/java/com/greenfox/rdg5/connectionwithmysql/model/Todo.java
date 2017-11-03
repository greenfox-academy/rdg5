package com.greenfox.rdg5.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

  public String setUrgent(boolean urgent) {
    this.urgent = urgent;
    return urgent ? "yes" : "no";
  }

  public String setDone(boolean done) {
    this.done = done;
    return done ? "yes" : "no";
  }

  public Long getId() {
    return id;

  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String title;
  boolean urgent;
  boolean done;

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;

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