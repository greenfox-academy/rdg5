public class Character extends Board {

  int maxHp, currentHp, dp, sp;


  public boolean isAlive() {    //placeholder for the hp thingy
    if (this.currentHp >= 1) {
      return true;
    } else {
      return false;
    }
  }


}
