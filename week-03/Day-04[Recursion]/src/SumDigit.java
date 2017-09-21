public class SumDigit {

  public static void main(String[] args) {
    System.out.println(sumDigit(126));
  }

  public static int sumDigit(int n) {
    int lastDigit = n % 10;
    int firstSegment = n / 10;
    if (n == 0) {
      return n;
    }
    return sumDigit(firstSegment) + lastDigit;
  }
}