// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a number to check if it is odd or even");
        int userinput1 = scanner.nextInt();

        if (userinput1 % 2 == 0) {
            System.out.println("You entered an even number.");
        } else {
            System.out.println("You entered an odd number.");
        }

    }
}

