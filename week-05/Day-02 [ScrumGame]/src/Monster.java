public class Monster extends Character {

  public Monster() {
    super("./Assets/skeleton.png", 1, 1);
    this.posX = (int) (Math.random() * 10);
    this.posY = (int) (Math.random() * 10);
  }

}
