package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  protected void sound() {
    System.out.println("Duum-duum-duum");

  }

  @Override
  public void play() {
    System.out.printf("Bass Guitar, a " + numberOfStrings + "-stringed instrument that ");
    sound();

  }

}
