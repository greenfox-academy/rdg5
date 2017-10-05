import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircraft> aircrafts;
  int carrierTotalAmmo;
  int hp;
  int carrierAmmo;
  F16 f16;
  F35 f35;

  public Carrier() {
    carrierTotalAmmo = 1500;
    carrierAmmo = carrierTotalAmmo;
    hp = 100;
  }

  public Carrier(int carrierTotalAmmo, int hp) {
    this.carrierTotalAmmo = carrierTotalAmmo;
    this.hp = hp;
  }

  public void addAircraft(Aircraft type) {
    if (type.equals("f16")) {
      aircrafts.add(f16);
      System.out.println("A new " + type + " aircraft has been added to your carrier");
    } else if (type.equals("f35")) {
      aircrafts.add(f35);
      System.out.println("A new " + type + " aircraft has been added to your carrier");
    }
  }

  public void fill() {
    for (Aircraft a : aircrafts) {
      carrierAmmo--;
      a.refill(a.currentAmmo);
      if (carrierTotalAmmo < a.maxAmmo) {

      }
    }
  }
}
