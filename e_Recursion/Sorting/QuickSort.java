package e_Recursion.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    int[] num = {1, 3, 2, 5, 4};
    QS(num, 0, num.length - 1);
    System.out.println(Arrays.toString(num));
    }

    static void QS(int[] arr, int low, int hig) {
        if(low >= hig) return;

        int s = low;
        int e = hig;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while (s <= e) {
//            Also a reason why, if it's already sorted it will not swap
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p){
                e--;
            }
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
//        Now, pivot at it's correct index, please sort the two halves now
        QS(arr, low, e);
        QS(arr, s, hig);
    }
}
