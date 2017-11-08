package com.greenfox.rdg5.resttest.model;

public class Grootling {

  String received;
  String translated;

  public Grootling(String received) {
    this.received = received;
    translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = "I am Groot!";
  }
}
