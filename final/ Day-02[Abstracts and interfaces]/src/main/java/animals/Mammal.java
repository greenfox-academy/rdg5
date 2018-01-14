package main.java.animals;

public class Mammal extends Animal {

  String name;

  public String getName() {
    return name;
  }

  public Mammal(String name) {
    this.name = name;

  }

  @Override
  void greet() {

  }

  @Override
  public String wantChild() {

    return "want a child from my uterus!";

  }

}
