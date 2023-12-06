package a_Array_ArrayList;

public class F_MaxMin {
    public static void main(String[] args) {
        int[] nums = {13,24,37,14,55,96,67};
        System.out.println(max(nums) + " "+ min(nums));
    }

    static int max(int[] arr) {
        if(arr.length == 0) return -1;
        int maxm = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > maxm) {
                maxm = ele;
            }
        }
        return maxm;
    }
    static int min(int[] arr) {
        if(arr.length == 0) return -1;
        int mini = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < mini) {
                mini = ele;
            }
        }
        return mini;
    }
}
