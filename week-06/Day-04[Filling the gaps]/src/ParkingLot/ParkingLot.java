package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  List<Car> carsInLot;
  Car newCar;

  public ParkingLot(int numberOfCars) {
    carsInLot = new ArrayList<>();
    for (int i=0; i < numberOfCars; i++) {
      newCar = new Car();
      carsInLot.add(newCar);
    }
  }
}
