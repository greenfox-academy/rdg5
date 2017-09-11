import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please type in the ammount of km's");
      int userInput1 = scanner.nextInt();
      double mile = userInput1 * 0.62137;

      System.out.println("\"In miles this is equal to: \"" + mile);



  }
}
