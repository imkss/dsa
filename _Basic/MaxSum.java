package _Basic;

import java.util.Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,};
        System.out.println(findSum(arr));
    }

    public static boolean findSum(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            sum += arr[i];
        }
        if(sum == arr[len - 1])
            return true;

        return false;
    }
}
