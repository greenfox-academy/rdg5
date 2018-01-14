import java.util.ArrayList;

public class Summing {

  static ArrayList<Integer> lista;

  public Summing() {
  }

  public static int sum(ArrayList<Integer> lista) {

    int sum = 0;
    for (int i = 0; i < lista.size(); i++) {
      sum = sum + lista.get(i);
    }
    return sum;
  }


}


