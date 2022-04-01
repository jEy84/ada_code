package sorting_algorithm;
import java.util.*;

public class Quick_sort {
    public void quick_sort(int[] ary, int p, int r) {
        if (p < r) {
            int q = partition(ary, p, r);
            quick_sort(ary, p, q - 1);
            quick_sort(ary, q + 1, r);
        }
    }

    public int partition(int[] ary, int p, int r) {
        int x = ary[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (ary[j] <= x) {
                i++;
                swap(ary, i, j);
            }
        }
        swap(ary, i + 1, r);
        return i + 1;
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Quick_sort bub = new Quick_sort();
        int[] ary = new int[60000];
        Random random = new Random();
        for (int i = 0; i < ary.length; i++) {
            int y = random.nextInt(1000);
            ary[i] = y;
        }
        long start = System.currentTimeMillis();
        bub.quick_sort(ary, 0, ary.length - 1);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

         // comment out next line too big array 
        System.out.println(Arrays.toString(ary));

        System.out.println("\nTime Taken is by(Quick Sort) :" + elapsedTime + " ms\n");
    }
}
