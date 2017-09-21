public class Bunny1 {

  public static void main(String[] args) {
    System.out.println(earCounter(8));
  }

  public static int earCounter(int bunnies) {
    if (bunnies == 1) {
      return 2;
    }
    return 2 + earCounter(bunnies - 1);
  }
}
