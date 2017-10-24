package twentyplusone;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

  static ArrayList<Card> deckOfCards;

  public Deck() {
    deckOfCards = new ArrayList<>();
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        deckOfCards.add(new Card(suit, rank));
      }
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(deckOfCards);
  }

  public static Card pull(int pullCard) {
    if (deckOfCards.isEmpty()) {
      return null;
    }
    Card cardDrawn = deckOfCards.get(pullCard);
    deckOfCards.remove(pullCard);
    return cardDrawn;
  }

  public static Card pullFirst() {
    return pull(0);
  }

  public Card pullLast() {
    return pull(deckOfCards.size() - 1);
  }

  public Card pullRandom() {
    return deckOfCards.get((int) Math.random() * deckOfCards.size());
  }

}
