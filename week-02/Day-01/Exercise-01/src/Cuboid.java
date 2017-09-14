// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000

import java.util.Scanner;

public class Cuboid {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the size of the sides: ");
    double side = scanner.nextInt();
    double surface = 6 * (side * side);
    double volume = side * side * side;
    String surfaceText = "The surface of the cuboid is: " + surface;
    String volumeText = "The volume of the cuboid is: " + volume;

    System.out.println(surfaceText);
    System.out.println(volumeText);


  }
}