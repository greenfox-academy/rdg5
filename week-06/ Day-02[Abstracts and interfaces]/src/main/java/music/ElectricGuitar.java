package main.java.music;

public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar() {
    super(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }


  @Override
  protected void sound() {
    System.out.println("twangs");

  }

  @Override
  public void play() {
    System.out.printf("Electric Guitar, a " + numberOfStrings + "-stringed instrument that ");
    sound();
  }

}
