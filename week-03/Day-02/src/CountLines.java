// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {
    countTheLines("jóska.txt");
    System.out.println(countTheLines("jóska.txt"));
  }

  public static int countTheLines(String filename) {
    Path filePath = Paths.get("");
    try {
      List<String> lines = Files.readAllLines(filePath);
      int count = 0;
      for (String line : lines) {
        count++;
      }
      return count;
    } catch (IOException e) {
      return 0;
    }
  }
}