import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the range: ");
    int range = scanner.nextInt();
    int random = 1 + (int) (Math.random() * (range - 1));
    int guess = random;
    int lives = 5;
    boolean win = false;

    while (win == false) {
      System.out.println("Please enter your guess: ");
      guess = scanner.nextInt();
      lives--;
      if (lives == 0) {
        System.out.println("No more lives left! Sorry, you lost, you NOOB!");
        break;
      }
      if (guess == random) {
        win = true;
        System.out.println("Congrats! You are awesome!");
      } else if (guess < random) {
        System.out.println("Too low! Try a bit bigger!" + "You have " + lives + " lives left!");
      } else if (guess > random) {
        System.out.println("Too high! Try a bit lower!" + "You have " + lives + " lives left!");
      }
    }
  }
}

