public class SumAll {

  public static void main(String[] args) {
    int sum = 0;
    int[] ai = {3, 4, 5, 6, 7};
    for (int i = 0; i < ai.length; i++) {
      sum += ai[i];
    }
    System.out.println(sum);
  }
}
