package _Numbers;

import java.util.Scanner;

public class IntAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = arr.length;
        double avg = 0;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double)sum / len;
        System.out.println(avg);
    }
}
