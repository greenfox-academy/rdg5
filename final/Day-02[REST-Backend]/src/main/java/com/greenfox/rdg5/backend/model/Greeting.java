package com.greenfox.rdg5.backend.model;

public class Greeting {

  String welcome_message;

  public Greeting(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

}
