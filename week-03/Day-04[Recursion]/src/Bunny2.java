public class Bunny2 {

  public static void main(String[] args) {
    System.out.println(earCounter(9));
  }

  public static int earCounter(int n) {
    /*----------------------------------------------------------------------------------------------
    First solution, which checks only how many ears does the particular bunny have,after checking
    its position.
    if (n % 2 != 0) {
     return 2;
    } else if (n % 2 == 0) {
      return 3;
    }
    return 2 + earCounter(n - 1);

    ----------------------------------------------------------------------------------------------*/
    if (n == 0) {
      return 0;
    }
    if (n % 2 == 0) {
      return 3 + earCounter(n - 1);
    } else {
      return 2 + earCounter(n - 1);
    }
  }
}

