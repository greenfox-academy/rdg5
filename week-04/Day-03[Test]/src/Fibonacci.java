public class Fibonacci {

  public Fibonacci() {
  }

  public static int fiboingIt(int n) {
    if (n < 2) {
      return n;
    }
    return fiboingIt(n - 1) + fiboingIt(n - 2);
  }
}

