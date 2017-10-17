import java.util.ArrayList;

public class UniqueChars {

  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static ArrayList<String> uniqueCharacters(String input) {
    ArrayList<String> unix = new ArrayList<>();
    ArrayList<String> notUnix = new ArrayList<>();

    for (int i = 0; i < input.length(); i++) {
      String letter = String.valueOf(input.charAt(i));
      if (!unix.contains(letter) && !notUnix.contains(letter)) {
        unix.add(letter);
      } else {
        unix.remove(letter);
        notUnix.add(letter);
      }
    }
    return unix;
  }

}