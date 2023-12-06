package _Sorting;

import java.util.Arrays;

public class C_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, -6, 5, 4, 0, 2, 1};
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
