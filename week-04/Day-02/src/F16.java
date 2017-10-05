public class F16 extends Aircraft {


  public F16() {
    maxAmmo = 8;
    baseDmg = 30;
    type = "F16";
  }

  public F16(String type) {
    super.type = type;
    maxAmmo = 8;
    baseDmg = 30;
  }
}
