package a_Array_ArrayList;

import java.util.Arrays;

public class E_Swap {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        swap(nums,2,4);
        System.out.println(Arrays.toString(nums));
    }
    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
