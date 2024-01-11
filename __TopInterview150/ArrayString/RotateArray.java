package __TopInterview150.ArrayString;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int k = 3;
    rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int ind = nums.length - 1;
        reverse(nums, 0, ind);
        reverse(nums, 0, k - 1);
        reverse(nums, k, ind);
    }
    public static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
