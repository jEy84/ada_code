package sorting_algorithm;
import java.util.*;

public class Bubble_sort{

    // Main Algorithm 
    public void bubble(int A[]) {
        for (int i = 0; i < A.length - 1; i++)
            for (int j = 0; j < A.length - i - 1; j++)
                if (A[j] > A[j + 1])
                    swap(A, j, j + 1);
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
// Driver code
    public static void main(String[] args) {
        Bubble_sort bub = new Bubble_sort();

        // nmaking long random arry
        int[] ary = new int[60000];
        Random random = new Random();
        for (int i = 0; i < ary.length; i++) {
            int y = random.nextInt(1000);
            ary[i] = y;
        }

        // for checking time 
        long start = System.currentTimeMillis();
        bub.bubble(ary);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

         // comment out next line too big array 
        System.out.println(Arrays.toString(ary));

        System.out.println("\nTime Taken is by (BubbleSort):" + elapsedTime + " ms\n");
    }
}
