package _Basic;

import java.util.Scanner;

public class MinXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {1, 3, 5, 17, 9};
        int[] arr = {2, 4, 3, 6};
        int xor = arr[0];
        for(int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
        }
        int minX = xor;
        for(int i = 0; i < arr.length; i++) {
            int x = xor ^ arr[i];
            minX = Math.min(x, minX);
        }
        System.out.println(minX);
    }
}
