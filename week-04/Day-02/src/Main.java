public class Main {

  public static void main(String[] args) {
    System.out.println("Awesome!");
    System.out.println("\n");

    Aircraft pista = new F16();
    Aircraft jóska = new F35();

    System.out.println(pista.getType());
    System.out.println("VS");
    System.out.println(jóska.getType());

    System.out.println("\n");
    System.out.println("Let's get ready to RUUMBLEEE");
    System.out.println("\n");


    pista.fight(jóska);
    System.out.println(pista.getStatus());
    pista.refill(500);
    System.out.println(pista.getStatus());

//    pista.refill(300);
//    System.out.println(pista.type);
//    System.out.println(pista.getStatus());
  }
}
