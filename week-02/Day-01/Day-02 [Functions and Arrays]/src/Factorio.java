public class Factorio {

  public static void main(String[] args) {

    /*System.out.println(factorio(5));
  }

  public static int factorio(int i) {
    if (i == 0) {
      return 0;
    }
    if (i > 1) {
      i = i * factorio(--i);
    }
    return i;
  }
} */

    int factorio = 1;
    int number = 5;
    for (int i = 1; i <= number; i++) {
      factorio = factorio * i;
    }
    System.out.println(factorio);

  }
}

