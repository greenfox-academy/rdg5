public class Main {

  public static void main(String[] args) {
    System.out.println("Awesome!");
    System.out.println("\n");

    Aircraft pista = new F16();
    Aircraft jóska = new F35();

    Carrier gizi = new Carrier();
    gizi.addAircraft(new Aircraft("f16"));


//    pista.refill(300);
//    System.out.println(pista.type);
//    System.out.println(pista.getStatus());
  }
}
