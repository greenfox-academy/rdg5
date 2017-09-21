public class Counter {

  public static void main(String[] args) {
    countdown(5);
  }

  public static int countdown(int n) {
    if (n == 1) {
      return 1;
    }
    System.out.println(n);
    return countdown(n - 1);
  }
}
