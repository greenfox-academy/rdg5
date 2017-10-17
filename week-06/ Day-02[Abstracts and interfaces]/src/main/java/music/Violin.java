package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    super(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  protected void sound() {
    System.out.println("screeches");

  }

  @Override
  public void play() {
    System.out.printf(" Violin, a " + numberOfStrings + "-stringed instrument that ");
    sound();
  }

}
