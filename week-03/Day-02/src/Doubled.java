import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    List<String> txt = new ArrayList<>();
    String doubled = "";
    try {
      Path path = Paths.get("src/duplicated-chars.txt");
      txt.addAll(Files.readAllLines(path));
      for (int i = 0; i < txt.size(); i++) {
        for (int j = 0; j < txt.get(i).length(); j = j + 2) {
          doubled = txt.get(i).valueOf(txt.get(i).charAt(j));
        }
        doubled += "\n";
      }
      System.out.println(txt);
    } catch (IOException e) {
    }
  }
}

