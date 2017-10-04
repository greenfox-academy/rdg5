public class Hero extends Character {
  String heroUp, heroDown, heroLeft, heroRight;

  public Hero() {
    super("./Assets/hero-down.png", 0, 0);
    heroUp = "./Assets/hero-up.png";
    heroDown="./Assets/hero-down.png";
    heroLeft="./Assets/hero-left.png";
    heroRight="./Assets/hero-right.png";
  }


}
