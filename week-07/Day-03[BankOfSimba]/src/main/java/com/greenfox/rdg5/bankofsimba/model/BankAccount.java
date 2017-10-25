package com.greenfox.rdg5.bankofsimba.model;

public class BankAccount {

  String name;
  int balance;
  String animalType;
  String currency;
  boolean isKing;
  boolean isBadGuy;


  public boolean isBadGuy() {
    return isBadGuy;
  }

  public void setBadGuy() {
    isBadGuy = true;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing() {
    isKing = true;
  }

  public String getCurrency() {
    return currency;
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
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
