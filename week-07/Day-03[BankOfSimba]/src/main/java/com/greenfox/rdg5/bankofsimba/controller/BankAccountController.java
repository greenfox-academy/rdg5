package com.greenfox.rdg5.bankofsimba.controller;

import com.greenfox.rdg5.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion");
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping(value = "/Exercise1")
  public String initBankAccount(Model model) {
    model.addAttribute("name", simbaAccount.getName());
    model.addAttribute("balance", simbaAccount.getBalance());
    model.addAttribute("type", simbaAccount.getAnimalType());
    model.addAttribute("currency", simbaAccount.getCurrency());
    return "Exercise1";
  }

  @RequestMapping(value = "/enjoy")
  public String enjoy() {
    return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
  }

}
