public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String backgroundColor, String textColor, String text) {
    this.backgroundColor = backgroundColor;
    this.textColor = textColor;
    this.text = text;
  }
  public static void main(String[] args) {
    PostIt orange = new PostIt("orange", "blue", "Idea1");
    PostIt pink = new PostIt("pink", "black", "Awesome!");
    PostIt yellow = new PostIt("yelow", "green", "Superb!");
  }
}