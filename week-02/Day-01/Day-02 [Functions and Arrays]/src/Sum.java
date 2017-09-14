public class Sum {

  public static void main(String[] args) {
    sum(7);
  }

  public static int sum(int input) {
    int sumOfAllNumbers = 0;
    for (int i = 0; i < input; i++) {
      sumOfAllNumbers += i;
    }
    return sumOfAllNumbers;
  }
}
