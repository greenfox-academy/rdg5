import com.sun.deploy.util.StringUtils;

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 10;
    // make it bigger by 10
      System.out.println(a);

      int b = 100;
      b -= 7;
    // make it smaller by 7
      System.out.println(b);

      int c = 44;
      c *= 2;
    // please double c's value
      System.out.println(c);
    

      int d = 125;
      d /= 5;
	  // please divide by 5 d's value 
      System.out.println(d);


      int e = 8;
      e *= e*e;
	  // please cube of e's value
      System.out.println(e);



      int f1 = 123;
      int f2 = 345;
      boolean answer = f1 > f2;
  	// tell if f1 is bigger than f2 (print as a boolean)
      System.out.println(answer);


      int g1 = 350;
  	  int g2 = 200;
  	  boolean DoubleAnswer = g2 * 2 > g1;
  	// tell if the double of g2 is bigger than g1 (print as a boolean)
      System.out.println(DoubleAnswer);



		int h = 135798745;


	  // tell if it has 11 as a divisor (print as a boolean)



      int i1 = 10;
	  int i2 = 3;
	  boolean SquaredAndCubed = i1 > (i2*i2) && i1 < (i2*i2*i2);

  	// tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
      System.out.println(SquaredAndCubed);



		int j = 1521;
		boolean dividableby3 = (j % 3) == 0;
		boolean dividableby5 = (j % 5) ==0;
      System.out.println(dividableby3 || dividableby5);
      // tell if j is dividable by 3 or 5 (print as a boolean)





		String k = "Apple";

  	//fill the k variable with its content 4 times
      System.out.println(String.join(",", "Apple","Apple","Apple","Apple"));
}
}
