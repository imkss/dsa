package _Basic;

import java.util.Scanner;

public class DiffSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum_div = 0;
        int sum_NotDiv = 0;
        for(int i = 1; i <= n; i++) {
            if(i % m != 0) {
                sum_NotDiv += i;
            } else {
                sum_div += i;
            }
        }
        System.out.println(sum_NotDiv - sum_div);
    }
}
