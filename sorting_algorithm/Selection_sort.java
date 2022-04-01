package sorting_algorithm;
import java.util.*;

public class Selection_sort {
    public void selection(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < A.length; j++)
                if (A[j] < A[min])
                    min = j;
            swap(A, min, i);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

public static void main(String[] args) {
        Selection_sort bub =new Selection_sort();

        //making large array so that we can check time complexity for alog 
        int[] ary = new int[60000];
        Random random = new Random();
        for (int i = 0; i < ary.length; i++) {
         int y = random.nextInt(1000);
         ary[i]=y;
        }

        long start = System.currentTimeMillis();
        bub.selection(ary);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        //sorted array (comment out it's too long)  ary
        System.out.println(Arrays.toString(ary));

        System.out.println("\nTime Taken is by(SelectionSort) :"+elapsedTime+" ms\n");
      }
}
