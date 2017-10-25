package com.greenfox.rdg5.bankofsimba.model;

public class BankAccount {

  String name;
  int balance;
  String animalType;
  String currency;

  public String getCurrency() {
    return currency;
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance =  balance;
    this.animalType = animalType;
    this.currency = "zebra";
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
