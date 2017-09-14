// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = 1;

        System.out.print("[" + matrix[i][j] + "]");
      }
      System.out.println();

    }
  }
}




    //for (int i = 0; i < 4; i++) {
      //System.out.println();
      //for (int j = 0; j < 4; j++) {
    //System.out.println(Arrays.deepToString(matrix).replace("],", "\n"));


        //System.out.println();
        //System.out.println(matrix[i][j] + " ");
       // System.out.println(Arrays.deepToString(matrix));
      //}
      //System.out.println();
   // }

  //}
//}