public class Boss extends Character {

  public Boss() {
    super("./Assets/boss.png", 1, 1);
    this.posX = (int) (Math.random() * 10);
    this.posY = (int) (Math.random() * 10);
  }
}
