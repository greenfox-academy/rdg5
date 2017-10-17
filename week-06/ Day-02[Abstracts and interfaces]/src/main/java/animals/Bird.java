package main.java.animals;

public class Bird extends Animal {

  String name;

  public String getName() {
    return name;
  }

  public Bird(String name) {
    this.name = name;

  }

  @Override
  void greet() {

  }

  @Override
  public String wantChild() {

    return "want a child from an egg!";
  }

}
