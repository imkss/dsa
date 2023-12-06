package _Sorting;

import java.util.Arrays;

public class B_BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, -6, 5, 4, 0, 2, 1};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));        
    }

//  PUSH THE MAXIMUM TO THE LAST BY ADJACENT SWAPS
    static void BubbleSort(int[]arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) swap(arr, j, j + 1);
            }
        }
    }
    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
