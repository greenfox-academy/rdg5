// Create a program that prints all the even numbers between 0 and 500

public class PrintEven {
    public static void main(String[] args) {
        int a = 0;

        while (a < 501) {
            System.out.println(a);
            a += 1;
        }

        for (int i = 0; i < 501; i++) {
            System.out.println(a);
        }
    }
}