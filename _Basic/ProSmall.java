package _Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ProSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0) {

        int sum = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int fir = arr[0];
            int sec = arr[1];

            if((fir + sec) < sum) {
                System.out.println(fir * sec);
            } else System.out.println(fir + sec);

            t--;
        }
    }
}

