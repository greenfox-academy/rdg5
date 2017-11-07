package com.greenfox.rdg5.backend.controller;

public class ErrorHandler {

  String error;

  public ErrorHandler(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

}
