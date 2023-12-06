package _Sorting;

import java.util.ArrayList;
import java.util.Arrays;
public class D_MergeSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, -6, 5, 4, 0, 2, 1};
        int low = 0;
        int high = nums.length - 1;
        MergeSort(nums, low, high);
        System.out.println(Arrays.toString(nums));
    }

//    DIVIDE & MERGE
    static void MergeSort(int[] arr, int low, int high) {
        if(low == high) return;
        int mid = (high + low) / 2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);
    }
    static void Merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
