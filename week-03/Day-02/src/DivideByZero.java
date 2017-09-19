// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number that you want to divide: ");
    int divisor = scanner.nextInt();
    divByZero(divisor);
  }

  public static void divByZero(int input) {
    try {
      System.out.println(10 / input);
    } catch (ArithmeticException exception) {
      System.out.println("fail");
    }
  }
}