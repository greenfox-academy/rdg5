public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fiboingIt(8));
  }

  public static int fiboingIt(int n) {
    if (n < 2) {
      return n;
    }
    return fiboingIt(n - 1) + fiboingIt(n - 2);
  }
}
