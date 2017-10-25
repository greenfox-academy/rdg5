package com.greenfox.rdg5.bankofsimba.controller;

import com.greenfox.rdg5.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount simbaAcc = new BankAccount("Simba", 2000, "lion");
  BankAccount zazuAcc = new BankAccount("Zazu", 6000, "red-billed hornbill");
  BankAccount shenziAcc = new BankAccount("Shenzi", 500, "hyena");
  BankAccount fredAcc = new BankAccount("Fred", 2000, "meerkat");
  BankAccount pumbaaAcc = new BankAccount("Pumbaa", 13000, "warthog");

  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping(value = "/Exercise1")
  public String initBankAccount(Model model) {
    model.addAttribute("name", simbaAcc.getName());
    model.addAttribute("balance", simbaAcc.getBalance());
    model.addAttribute("type", simbaAcc.getAnimalType());
    model.addAttribute("currency", simbaAcc.getCurrency());
    return "Exercise1";
  }


  @RequestMapping(value = "/Exercise5")
  public String fillMultipleAccounts(Model model) {
    accounts.add(0, simbaAcc);
    accounts.add(1, zazuAcc);
    accounts.add(2, shenziAcc);
    accounts.add(3, fredAcc);
    accounts.add(4, pumbaaAcc);
    model.addAttribute("accounts", accounts);
    return "Exercise5";
  }
}
