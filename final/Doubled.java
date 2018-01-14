import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    System.out.print(simplifier("duplicated-chars.txt"));
  }

  public static void simplifier(String input) {

    try {
      Path filePath = Paths.get(input);
      List<String> txt = new ArrayList<>();
      String simplified = "";
      txt.addAll(Files.readAllLines(filePath));
      for (int i = 0; i < txt.size(); i++) {
        for (int j = 0; j < txt.get(i).length(); j = j + 2) {
          System.out.println(simplified);
        }
      }
    } catch (IOException e) {
    }
  }
}

