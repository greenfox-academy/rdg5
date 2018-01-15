import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = {1, 2, 3};
        int[] b = {6, 7, 8};


        System.out.println(Arrays.toString(merger(a, b)));
    }


    public static int[] merger(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int j = 0, k = 0, l = 0;
        int max = Math.max(a.length, b.length);
        for (int i = 0; i < max; i++) {
            if (j < a.length)
                result[l++] = a[j++];
            if (k < b.length)
                result[l++] = b[k++];
        }
        return result;
    }

}
