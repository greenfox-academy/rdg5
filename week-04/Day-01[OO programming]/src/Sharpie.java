public class Sharpie {

  String color;
  float width;
  float inkAmount = 100;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }

  public void use() {
    this.inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie bela = new Sharpie("blue", 7.5f);
    bela.use();
    System.out.println(bela.color);
  }
}
