package com.greenfox.rdg5.bankofsimba.controller;

import com.greenfox.rdg5.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  ArrayList<BankAccount> accounts = new ArrayList<>();

  public BankAccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Zazu", 6000, "red-billed hornbill"));
    accounts.add(new BankAccount("Shenzi", 500, "hyena"));
    accounts.add(new BankAccount("Fred", 2000, "meerkat"));
    accounts.add(new BankAccount("Pumbaa", 13000, "warthog"));

  }

  @RequestMapping(value = "/Exercise1")
  public String initBankAccount(Model model) {
    model.addAttribute("name", accounts.get(0).getName());
    model.addAttribute("balance", accounts.get(0).getBalance());
    model.addAttribute("type", accounts.get(0).getAnimalType());
    model.addAttribute("currency", accounts.get(0).getCurrency());
    return "Exercise1";
  }


  @RequestMapping(value = "/Exercise5")
  public String fillMultipleAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "Exercise5";
  }
}
