package com.greenfox.rdg5.messageservice.service;


public class TwitterService implements MessageService {


  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Tweet message: " + message + " - sent via Twitter");
  }

}
