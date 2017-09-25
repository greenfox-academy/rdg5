public class Beard {

  public static void main(String[] args) {
    System.out.println(beardCounter(3));
  }

  public static int beardCounter(int beardedGuys) {
    if (beardedGuys == 1) {
      return 10000;
    }
    return 10000 + beardCounter(beardedGuys - 1);
  }
}
