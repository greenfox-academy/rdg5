// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.lang.reflect.Array;
import java.util.Scanner;

public class AverageOfInput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in five numbers: ");
    int nr1 = scanner.nextInt();
    int nr2 = scanner.nextInt();
    int nr3 = scanner.nextInt();
    int nr4 = scanner.nextInt();
    int nr5 = scanner.nextInt();

    int sum = nr1 + nr2 + nr3 + nr4 + nr5;
    int average = (nr1 + nr2 + nr3 + nr4 + nr5) / 5;

    System.out.println("The sum of the numbers is:" + sum);
    System.out.println("The average of the numbers is:" + average);

  }
}