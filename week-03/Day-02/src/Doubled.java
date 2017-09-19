import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path path = Paths.get("duplicated-chars.txt");

    try {
      List<String> txt = Files.readAllLines(path);
      System.out.println(txt);
      for (String characters : txt) {
        String duplicated;
        for (int i = 0; i < characters.length(); i++) {

        }
      }
    }catch(IOException e){
        }
      }
    }

