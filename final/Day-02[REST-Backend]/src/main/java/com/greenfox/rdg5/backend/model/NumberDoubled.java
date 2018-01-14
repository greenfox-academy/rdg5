package com.greenfox.rdg5.backend.model;

public class NumberDoubled {

  Integer received;
  Integer result;

  public NumberDoubled(Integer received) {
    this.received = received;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

}
