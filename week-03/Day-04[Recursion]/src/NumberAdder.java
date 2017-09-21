public class NumberAdder {

  public static void main(String[] args) {
    System.out.println(numAdd(5));
  }

  public static int numAdd(int n) {
    if (n == 1) {
      return 1;
    }
    return n + numAdd(n - 1);
  }
}
