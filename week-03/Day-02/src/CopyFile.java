// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
public class CopyFile {

  public static void main(String[] args) {
    /*copy("a.txt", "b.txt");

  } public static boolean copy (String source, String destination){
    List<String> newList = new ArrayList<>();
    try {
      Files.copy(Paths.get(source), new FileOutputStream(destination));
      copy("","");
      if (source == destination)
      return true;
    } catch (IOException e) {
    } return false;
    */