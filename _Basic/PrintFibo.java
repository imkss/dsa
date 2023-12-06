package _Basic;

import java.util.ArrayList;

public class PrintFibo {
    public static void main(String[] args) {
        System.out.println(printFibonacciSequence(10));
    }
    public static ArrayList<Integer> printFibonacciSequence(int n) {
        ArrayList<Integer> series = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            series.add(a);
            a = b;
            b = c;
            c = a + b;
        }
        return series;
    }
}
