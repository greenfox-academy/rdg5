package TwentyPlusOne;

import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    int opponentScore = (int) (Math.random() * ((21 - 15) + 1)) + 15;
    int playerScore = 0;
    Deck d = new Deck();
    d.shuffleDeck();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Greetings. Let the games begin!");
    System.out.println("Do you want to draw a card? y/n ");

    if (scanner.nextLine().equals("n")) {
      System.out.println("You suck! Goodbye!");
    }
    if (scanner.nextLine().equals("y")){
      System.out.println("Oko, we shall start!");
    }

    while (playerScore <= 21 && scanner.nextLine().equals("y")) {
      System.out.println("Your score is: " + playerScore + " Do you want to draw another card?");
      playerScore += d.pullFirst().getValue();
      if (playerScore > 21 ) {
        break;
      }
    }

  }
}
