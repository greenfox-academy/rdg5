import java.util.Scanner;

public class Factorio {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number: ");
    int input1 = scanner.nextInt();

    System.out.print(factorio(input1));

  }
  public static int  factorio(int x) {
    int factorial = 1;
    for (int i = 1; i <= x + 1 ; i++) {
      factorial *= 1;
    }
    return factorial;
  }
}
