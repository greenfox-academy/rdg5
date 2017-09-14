import java.util.Scanner;

public class AnimalsAndLegs {

  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the number of chickens: ");
    int nrOfChicken = scanner.nextInt();
    System.out.println("Please type in the number of pigs: ");
    int nrofPigs = scanner.nextInt();
    int chickenLegs = nrOfChicken * 2;
    int pigLegs = nrofPigs * 4;
    String printOut = "The number of legs all the animals have is: ";
    System.out.println(printOut + (chickenLegs + pigLegs));
  }
}
