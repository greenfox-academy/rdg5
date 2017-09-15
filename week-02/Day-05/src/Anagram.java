import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first word: ");
    String input1 = scanner.nextLine();
    System.out.println("Please enter the second word: ");
    String input2 = scanner.nextLine();

    if (input1.length() == input2.length()) {
      input1.equals(input2);
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
