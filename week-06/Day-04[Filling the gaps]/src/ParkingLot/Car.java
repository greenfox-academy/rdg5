package ParkingLot;

public class Car {

  public enum TYPE {
    TRABI, SKODA, LADA, DACIA
  }

  public enum COLOR {
    RED, WHITE, BLUE, GREEN
  }

  TYPE type;
  COLOR color;

  public Car() {
    int typeIndex = (int) (Math.random() * TYPE.values().length);
    int colorIndex = (int) (Math.random() * COLOR.values().length);
    type = TYPE.values()[typeIndex];
    color = COLOR.values()[colorIndex];
  }
}


