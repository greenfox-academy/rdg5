package com.greenfox.rdg5.backend.model;

public class Appendee {

  String appended;

  public Appendee(String appended) {
    this.appended = appended.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended.concat("a");
  }


}
