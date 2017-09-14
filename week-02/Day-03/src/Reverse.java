public class Reverse {

  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

//----------------------------------------------------------------------------------------------------------------------
    // Not charAt() answer [code snippet from stackoverflow]

    //String reverse = new StringBuffer(reversed).reverse().toString();
    //System.out.println(reverse);

//----------------------------------------------------------------------------------------------------------------------
    String reverse = "";
    for (int i = reversed.length() - 1; i >= 0; i--) {
      reverse = reverse + reversed.charAt(i);
    }
    System.out.println(reverse);
  }
}