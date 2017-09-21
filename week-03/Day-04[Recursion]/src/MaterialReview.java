//MatReview by Aze
public class MaterialReview {

  public static void main(String[] args) {

  }
  static int factorial(int input){
    int result = 1;
    for (int i = 1; i < input; i++) {
      result *= i;
    }return result;
  }
  static int factorio(int input){
    if (input == 1){
      return 1;
    }
    return factorio(input-1) * input;
  }
}
