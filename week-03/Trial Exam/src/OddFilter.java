import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class OddFilter {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every odd element from the orignal list
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println(oddFilter(numbers));
    // should print [1, 3, 5]
  }

  private static int oddFilter(int[] numbers) {
    int countOdd = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        countOdd++;
      }
    }
    return countOdd;
  }
}


