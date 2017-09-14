// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in two numbers: ");
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();

    if (firstNumber > secondNumber) {
      System.out.println(firstNumber);
    } else {
      System.out.println(secondNumber);
    }


  }
}