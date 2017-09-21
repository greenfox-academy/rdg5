//public class String2 {
//
//  public static void main(String[] args) {
//    System.out.println(charRemover("xerxes xaril xoxo", "x", ""));
//
//  }
//
//  public static String charRemover(String input, String target, String output) {
//    int position = input.indexOf(output);
//    if (position < 0) {
//      return input;
//    }
//    return input.substring(0, position) + output + charRemover(
//        input.substring(position + target.length()),
//        target.replace(target, ""), output);
//  }
//}
