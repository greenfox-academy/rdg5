import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    String input1;
    String input2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the first word :");
    input1 = scanner.nextLine();
    System.out.print("Please enter the second word :");
    input2 = scanner.nextLine();

    System.out.println(isAnagram(input1, input2));
  }

  public static boolean isAnagram(String input1, String input2) {
    if (input1.length() != input2.length()) {
      return false;
    } else {
      int value = 0;
      for (int i = 0; i < input1.length(); i++) {
        value += ((int) input1.charAt(i)) ^ 2;
        value -= ((int) input2.charAt(i)) ^ 2;
      }
      return value == 0;
    }
  }
}



