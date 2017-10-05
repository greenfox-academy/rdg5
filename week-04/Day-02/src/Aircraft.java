public class Aircraft {

  private int dmg;

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public String type;
  public int currentAmmo;
  public int maxAmmo;
  public int baseDmg;

  public Aircraft() {
    currentAmmo = 0;
  }

  public Aircraft(String type) {
    this.type = type;
    currentAmmo = 0;
  }


  public String fight(Aircraft another) {
    setCurrentAmmo(0);
    this.dmg = baseDmg * maxAmmo;
    return "Caused " + dmg + " damage";
  }

  public String refill(int number) {
    setCurrentAmmo(maxAmmo);
    int s = number - maxAmmo;
    return "remaining ammo is : " + s;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + " , Ammo: " + currentAmmo + ", Base Damage: " + baseDmg
        + ", All Damage: " + dmg;
  }
}
