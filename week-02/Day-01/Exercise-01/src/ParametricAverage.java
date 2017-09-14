// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      double sum = 0;
    System.out.println("Please enter the number of entries!");
    int number = scanner.nextInt();

    for (int i = 1; i < number ; i++) {
      System.out.println("Please input number " + i);
      sum += scanner.nextDouble();
     }

     System.out.println("Sum is: " + sum);
     double average = sum / number;
     System.out.println("The total average is: " +average);
     }
    }



  