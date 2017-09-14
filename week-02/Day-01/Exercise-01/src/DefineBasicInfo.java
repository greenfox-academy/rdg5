public class DefineBasicInfo {

  public static void main(String[] args) {
    // Define several things as a variable than print their values
    // Your name as a string
    // Your age as an integer
    // Your height in meters as a double
    // Wether you are married or not as a boolean

    String name = "Sándor Vass";
    int age = 24;
    double height = 184;
    boolean married = false;

    System.out.println(name);
    System.out.println(age);
    System.out.println(height);
    System.out.println("Am I married?");
    if (married == false) {
      System.out.println("No");
    }

  }
}
