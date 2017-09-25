public class postIt {

  String backgroundColor;
  String text;
  String textColor;

  public postIt(String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;

  public static void main(String[] args) {
    postIt orange = new postIt("orange", "blue", "Idea1");
    postIt pink = new postIt("pink", "black", "Awesome!");
    postIt yellow = new postIt("yelow", "green", "Superb!");
  }
}