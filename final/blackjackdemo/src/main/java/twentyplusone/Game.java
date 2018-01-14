package twentyplusone;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

  private static Deck deck;
  private static ArrayList<Card> playerHand;

  public static void main(String[] args) {
    deck = new Deck();
    deck.shuffleDeck();
    playerHand = new ArrayList<>();
    drawCards(2);
    int houseValue = (int) (Math.random() * ((21 - 15) + 1)) + 15;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Greetings! Let the games begin \n");

    while (getHandValue() < 21) {
      printPlayerHand();
      System.out.println("h: to Hit, s: to Stand,  r: to shuffle the deck");
      String choice = scanner.nextLine();
      if (choice.equals("h")) {
        drawCards(1);
      } else if (choice.equals("s")) {
        if (getHandValue() <= houseValue) {
          System.out.println("Hugh Laurie has " + houseValue
              + " points. You are a terrible player and yo mamma so stupid, she thought Spotify was a stain remover!");
          break;
        } else {
          System.out.println(
              "You win with " + getHandValue() + " points, Hugh Laurie had " + houseValue
                  + " points.");
          break;
        }
      } else if (choice.equals("r")) {
        deck.shuffleDeck();
        System.out.println("Deck is shuffled");
      }
    }
    if (getHandValue() == 21 && getHandValue() > houseValue) {
      System.out.println(
          "You won with 21! How cool is this? You were able to beat a 79 line program. Go home you sucker."
              + " Oh and Yo mama so stupid she thinks menopause is a button on a VCR");
    } else if (getHandValue() == 21 && getHandValue() < houseValue) {
      System.out.println("House wins with " + houseValue
          + " points. How can you be so bad? If I were you I'd donate my brain to the museum.");
    } else if (getHandValue() > 21) {
      System.out.println("You lost with " + getHandValue()
          + " points. You are a terrible player, go and play some Counter Strike instead you noob!");
    }
  }

  private static void printPlayerHand() {
    System.out.println("Your hand value is " + getHandValue());
  }

  private static void drawCards(int num) {
    for (int i = 0; i < num; i++) {
      playerHand.add(deck.pullFirst());
    }
  }

  private static int getHandValue() {
    int count = 0;
    for (Card card : playerHand) {
      count += card.getValue();
    }
    if (count > 21) {
      for (Card card : playerHand) {
        if (card.getValue() == 11) {
          count -= 10;
        }
        if (count <= 21) {
          break;
        }
      }
    }
    return count;
  }

}

