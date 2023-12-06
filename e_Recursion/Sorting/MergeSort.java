package e_Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] num = {5, 3, 1, 89, 1, 12, 2};
    num = MS(num);
    System.out.println(Arrays.toString(num));

//    Sorting in-place
    int[] arr = {15, 23, 22, 8, 11, 0, 2};
        MSinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] MS(int[] arr) {
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = MS(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MS(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second) {
    int[] mix = new int[first.length + second.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < first.length && j < second.length) {
    if(first[i] < second[j]){
        mix[k] = first[i];
        i++;
    } else {
        mix[k] = second[j];
        j++;
    }
        k++;
    }
//    If anyone of the array finished before another one
        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }



    static void MSinplace(int[] arr, int start, int end) {
        if(end - start == 1) return;
        int mid = (start + end) / 2;
        MSinplace(arr, start, mid);
        MSinplace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }
    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e) {
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
//    If anyone of the array finished before another one
        while (i < m) {
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j < e) {
            mix[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
