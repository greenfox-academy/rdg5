import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
public class GuessTheNumber {

  public static void main(String[] args) {
    double random = Math.random() * (101);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess the number");
    double guess;
    do {
      System.out.println("Enter your guess");
      guess = scanner.nextInt();
      if (guess == random) {
        System.out.println("Your guess is correct!");
      } else if (guess < random) {
        System.out.println("Your guess is smaller than the number");
      } else if (guess > random) {
        System.out.println("Your guess is bigger than the number");
      }
    } while (guess != random);
  }
}

