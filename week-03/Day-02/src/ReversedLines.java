import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    System.out.println(reverse("src/reversed-lines.txt"));

  }

  public static String reverse(String input) {
    Path filepath = Paths.get(input);
    try {
      List<String> fileContent = Files.readAllLines(filepath);
      List<String> contentReversed = new ArrayList<>();
      String rev = "";
      for (int i = 0; i < input.length(); i++) {
        rev = input.charAt(i) + rev;
        return rev;
      }
    } catch (IOException e) {
    }

  }
}
*/