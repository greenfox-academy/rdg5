package com.greenfox.rdg5.foxclub.model;

import java.util.List;
import org.springframework.context.annotation.Bean;

public class Fox {

  String name;
  List<Trick> tricks;
  String food;
  String drinks;

//  public String createFox() {
//
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrinks() {
    return drinks;
  }

  public void setDrinks(String drinks) {
    this.drinks = drinks;
  }
}
