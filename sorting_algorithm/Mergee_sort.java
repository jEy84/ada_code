package sorting_algorithm;
import java.util.*;

public class Mergee_sort {
    public void mergrecfunc(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergrecfunc(arr, l, m);
            mergrecfunc(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int arr[], int p, int q, int r) {
            int n1 = q - p + 1;
            int n2 = r - q;
            int L[] = new int[n1];
            int M[] = new int[n2];
            for (int i = 0; i < n1; i++) L[i] = arr[p + i];
            for (int j = 0; j < n2; j++) M[j] = arr[q + 1 + j];
            int i=0, j=0, k=p;

            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else{
            arr[k] = M[j];
            j++;
            }
            k++;
            }
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = M[j];
                j++;
                k++;
            }
        }
public static void main(String[] args) {
    Mergee_sort bub = new Mergee_sort();

    int[] ary = new int[60000];
    Random random = new Random();
    for (int i = 0; i < ary.length; i++) {
        int y = random.nextInt(1000);
        ary[i]=y;
    }

    long start = System.currentTimeMillis();
    bub.mergrecfunc(ary,0,ary.length-1);
    long end = System.currentTimeMillis();
    long elapsedTime= end - start;

    // comment out next line too big array 
    System.out.println(Arrays.toString(ary));

    System.out.println("Time Taken is by(mergeSort) :"+elapsedTime+"ms\n");
}
}
