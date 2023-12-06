package _Sorting;

import java.util.Arrays;

public class A_SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2, 34, 12, 3, -3, 0, 78};
        SelectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
// SELECT MINIMUM & SWAP
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
            if(arr[j] < arr[min]) min = j;
            }
            swap(arr, i, min);
        }
}
    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
