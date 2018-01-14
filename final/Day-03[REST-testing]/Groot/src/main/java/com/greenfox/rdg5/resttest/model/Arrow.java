package com.greenfox.rdg5.resttest.model;

public class Arrow {

  float distance;
  float time;
  float speed;

  public Arrow(float distance, float time, float speed) {
    this.distance = distance;
    this.time = time;
    this.speed = speed;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
