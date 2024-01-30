package _Numbers;

public class SwapNum {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 5;
//        b = b + a; // now b is sum of both the numbers
//        a = b - a; // b - a = (b + a) - a = b (a is swapped)
//        b = b - a; // (b + a) - b = a (b is swapped)
//        System.out.println(a + " " +b);
//
//        int x = 13;
//        int y = 53;
//        //swap
//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;
//        System.out.println(x + " " +y);
        tempSwap(45, 89);
    }
    public static void tempSwap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
