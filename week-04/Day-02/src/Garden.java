import static java.awt.Color.yellow;

import java.util.ArrayList;

public class Garden {

  String type;
  ArrayList<Plant> garden;

  public Garden(String type) {
    this.type = type;
    garden = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    garden.add(flower);

  }

  public void addTree(Tree tree) {

    garden.add(tree);
  }

  public void watering() {

  }

//  public static void main(String[] args) {
//    new Flower("yellow");
//    new Flower("blue");
//    new Tree("  purple");
//    new Tree("orange");
//
//    addFlower(Flower yellow);
//  }
}



