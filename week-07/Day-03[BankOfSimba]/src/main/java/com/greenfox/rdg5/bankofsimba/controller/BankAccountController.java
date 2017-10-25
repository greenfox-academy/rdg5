package com.greenfox.rdg5.bankofsimba.controller;

import com.greenfox.rdg5.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount simbaAccount = new BankAccount("Simba", 2000.0, "lion");

  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping(value = "/Exercise1")
  public String initBankAccount(Model model) {
    model.addAttribute("text",simbaAccount.getName()+ " , " +simbaAccount.getBalance() + " , " +simbaAccount.getAnimalType());
    return "Exercise1";
  }

}
