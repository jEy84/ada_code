package sorting_algorithm;
import java.util.*;

public class Insertion_sort {
    public void insertion(int A[]) {
        for (int i = 1; i < A.length; i++) {
            int k = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > k) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = k;
        }
    }

public static void main(String[] args) {
    Insertion_sort bub = new Insertion_sort();
    int[] ary = new int[60000];
    
    Random random = new Random();
    for (int i = 0; i < ary.length; i++) {
        int y = random.nextInt(1000);
        ary[i]=y;
    }
    long start = System.currentTimeMillis();
    bub.insertion(ary);
    long end = System.currentTimeMillis();
    long elapsedTime = end - start;

    // comment out next line arry to big 
    System.out.println(Arrays.toString(ary));

    System.out.println("\nTime Taken is by(insertionSort) :"+elapsedTime+"ms\n");
}
}
