package _Numbers;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mxm = Math.max(c, (Math.max(a, b)));
        System.out.println(mxm);
    }
}
