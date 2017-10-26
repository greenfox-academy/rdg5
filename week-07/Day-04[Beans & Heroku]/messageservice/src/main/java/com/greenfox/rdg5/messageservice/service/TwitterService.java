package com.greenfox.rdg5.messageservice.service;


import org.springframework.stereotype.Service;

public class TwitterService implements MessageService {


  @Override
  public void sendMessage(String message, String address) {
    System.out.println(message + " , " + address + " - sent via Twitter");
  }

}