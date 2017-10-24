package com.greenfox.rdg5.helloworld;

public class differentLanguages {

  String content;
  String color;
  int fontSize;

  public differentLanguages(String content, String color, int fontSize) {
    this.content = content;
    this.color = color;
    this.fontSize = fontSize;
  }

  public String getContent() {
    return this.content;
  }

  public int getFontSize() {
    return this.fontSize;
  }

  public String getColor() {
    return this.color;
  }
}
