package _Arrays;

import java.util.Arrays;

public class TwoMax {
    public static void main(String[] args) {
        int[] arr = {12, 67, 5, 67, 1, 23};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] != arr[i-1]) {
                System.out.println(arr[i] + " " + arr[i - 1]);
                break;
            }
        }
    }
}
