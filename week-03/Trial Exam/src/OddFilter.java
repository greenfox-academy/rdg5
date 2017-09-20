import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddFilter {

  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every odd element from the orignal list
    System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));

    // should print [1, 3, 5]
  }

  private static List<Integer> oddFilter(List<Integer> numbers) {
    ArrayList<Integer> odds = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        odds.add(numbers.get(i));
      }
    }
    return odds;
  }
}


