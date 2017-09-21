public class String1 {

  public static void main(String[] args) {
    System.out.println(charChanger("xall xield xour xawns ", "x", "y"));
  }

  public static String charChanger(String input, String target, String replacement) {
    if (target.isEmpty()) {
      return input;
    }
    int position = input.indexOf(target);
    if (position < 0) {
      return input;
    }
    return input.substring(0, position) + replacement + charChanger(
        input.substring(position + target.length()),
        target, replacement);
  }
}
