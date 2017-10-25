package com.greenfox.rdg5.bankofsimba.model;

public class BankAccount {

  String name;
  double Balance;
  String animalType;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    Balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return Balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
