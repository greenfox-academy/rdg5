import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character {

  String heroDown;
  String heroUp;
  String heroLeft;
  String heroRight;

  public Hero() {
    this.heroDown = "./Assets/hero-down.png";
    this.heroUp = "./Assets/hero-up.png";
    this.heroLeft = "./Assets/hero-left.png";
    this.heroRight = "./Assets/hero-right.png";

//    position x,y should be 0,0

  }
}
