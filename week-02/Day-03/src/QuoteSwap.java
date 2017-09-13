import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

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



        System.out.println(list);

    }
}