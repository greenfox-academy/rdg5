import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Card {

  ArrayList<String> color = new ArrayList<String>(
      Arrays.asList("clubs", "diamonds", "hearts", "spades"));
  ArrayList<String> number = new ArrayList<String>(
      Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));


  Map<String, String> deck = new HashMap<>();

  public Map<String, String> deckGeneration() {

    for (int i = 0; i < color.size(); i++) {
      for (int j = 0; j < number.size(); j++) {
        deck.put(color.get(i), number.get(j));

      }
    }

  }

}
