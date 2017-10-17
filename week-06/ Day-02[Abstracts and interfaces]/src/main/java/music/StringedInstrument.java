package main.java.music;

public abstract class StringedInstrument extends Instrument {

  protected int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  protected abstract void sound();

}
