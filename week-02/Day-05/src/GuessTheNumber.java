import java.util.Scanner;

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