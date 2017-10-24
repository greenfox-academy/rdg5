package com.greenfox.rdg5.helloworld;

public class differentLanguages {

  String content;
  String color;
  long fontSize;

  public differentLanguages(String content, String color, long fontSize) {
    this.content = content;
    this.color = color;
  }

  public differentLanguages(long value, String randomColor, long fontSize) {
  }

  public String getContent() {
    return this.content;
  }

  public long getFontSize() {
    return this.fontSize;
  }

  public String getColor() {
    return this.color;
  }
}
