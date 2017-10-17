import java.util.ArrayList;

public class CandyShop {

  int income;
  int sugarAmount;
  final static String CANDY = "candy";
  final static String LOLLIPOP = "lollipop";

  ArrayList<Dessert> storage = new ArrayList<>();

  public CandyShop(int sugarAmountGramms) {
    sugarAmount = sugarAmountGramms;
  }

  public void createSweets(String dessertType) {

    if (dessertType.equals("candy")) {
      storage.add(new Candy());
      sugarAmount -= storage.get(storage.size() - 1).price;
    } else {
      storage.add(new Lollipop());
      sugarAmount -= storage.get(storage.size() - 1).price;
    }
  }

  public void raise(int percentage) {
    for (Dessert dessert : storage) {
      dessert.raisePrice(percentage);
    }
  }

  public void sell(String dessertType, int ammount) {
    if (dessertType.equals("candy")) {
      income += getDessert(dessertType).price * ammount;
      for (int i = 0; i < ammount ; i++) {

      }
      storage.remove(ammount)
    }
  }

  public Dessert getDessert(String dessertTyoe) {
    for (int i = 0; i < storage.size(); i++) {
      if (storage.get(i) instanceof Lollipop && dessertTyoe.equals("lollipop")) {
        return storage.get(i);
      } else if {
        if (storage.get(i) instanceof Candy && dessertTyoe.equals("candy")) {
          return storage.get(i);
        }
      }
      return null;
    }
  }
}
