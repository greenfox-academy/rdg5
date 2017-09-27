public class Anagram {

  String first;
  String second;

  public Anagram() {
  }

  public static boolean isItAnagramOrIsItNot(String first, String second) {
    //this.first = first;
    //this.second = second;

    int[] charCount = new int[555];
    for (int i = 0; i < first.length(); i++) {
      charCount[first.charAt(i)]++;
    }
    for (int i = 0; i < second.length(); i++) {
      charCount[second.charAt(i)]--;
    }
    for (int i = 0; i < charCount.length; i++) {
      if (charCount[i] != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isItAnagramOrIsItNot("anagram", "margana"));
  }
}
