public class QuillCounter {

  public static void main(String[] args) {
    System.out.println(quillCounter(3));
  }

  public static int quillCounter(int hedgies) {
    if (hedgies == 1) {
      return 7000;
    }
    return 7000 + quillCounter(hedgies - 1);
  }
}
