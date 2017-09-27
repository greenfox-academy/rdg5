public class Plant {

  String color;
  int waterAmount;
  int absorbPercent;

  public Plant() {
    waterAmount = 0;
  }

  public void Flower(String color) {
    this.color = color;
  }

  public boolean flowerNeedsWater() {
    if (waterAmount < 5) {
      return true;
    }
    return false;
  }


  public void waterFlower(int amount) {
    if (flowerNeedsWater() == true) {
      waterAmount += (amount * absorbPercent / 100);
    }
  }

  public void Tree(String color) {
    this.color = color;
  }

  public boolean treeNeedsWater() {
    if (waterAmount < 10) {
      return true;
    }
    return false;
  }

  public void waterTree(int amount) {
    if (treeNeedsWater() == true) {
      waterAmount += (amount * absorbPercent / 100);
    }
  }
}
