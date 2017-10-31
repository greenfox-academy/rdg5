package com.greenfox.rdg5.messageservice.service;

public class EmailService implements MessageService {


  @Override
  public void sendMessage(String message, String address) {
    System.out.println(message + " , " + address + " - sent via Email");

  }

}
