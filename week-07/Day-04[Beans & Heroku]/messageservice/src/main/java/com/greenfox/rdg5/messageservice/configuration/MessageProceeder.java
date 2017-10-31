package com.greenfox.rdg5.messageservice.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greenfox.rdg5.messageservice.service.MessageService;

@Service
public class MessageProceeder {

  @Autowired
  MessageService service;


  public void processMessage(String message, String address) {
    service.sendMessage(message, address);

  }

}
