package a_Array_ArrayList;

import java.util.Arrays;

public class G_Rev {
    public static void main(String[] args) {
        int[] nums = {13,24,37,14,55,96,67};
        rev(nums);
        System.out.println(Arrays.toString(nums));

        SpclRev(nums, 2, 4);
        System.out.println(Arrays.toString(nums));
    }
    static void rev(int[] arr) {
        if(arr.length == 0) {
            return;
        }
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void SpclRev(int[] arr, int start, int end) {
        if(arr.length == 0) {
            return;
        }
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
