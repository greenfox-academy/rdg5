import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {

    isAnagram("dog", "god");

  }
  public static boolean isAnagram(String input1, String input2){

    String stringReversed = "";
    for (int i = input1.length() -1; i >= 0; i--) {
      char temporary = input1.charAt(i);
      stringReversed = stringReversed.concat(String.valueOf(temporary));
    }return false;

    //System.out.println(stringReversed.equals(input2));
  }
}
