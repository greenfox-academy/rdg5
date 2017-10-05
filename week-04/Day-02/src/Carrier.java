import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircraft> aircrafts;
  int carrierTotalAmmo;
  int hp;
  int carrierAmmo;

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
    aircrafts.add(type);
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
