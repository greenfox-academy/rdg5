import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class QuoteSwap {

  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(
        Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.
//-----------------------------------------------------------------------------------
    // The fun way:

        /*Collections.swap(list, 3, 6);
        Collections.swap(list, 6, 7);
        Collections.swap(list, 5, 6);
        Collections.swap(list, 4, 5);*/
//------------------------------------------------------------------------------------

    // String createTemp = list.get(3);
    //String iTemp = list.get(4);

    //list.set(3,"not");
    //list.set(4,"understand");
    //list.set(5, iTemp);

    System.out.println(list);

  }
}