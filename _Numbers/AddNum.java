package _Numbers;

import java.util.Scanner;

//WAP in Java to add two integer without using arithmetic operator
public class AddNum {
    public static void main(String[] args) {
        int x = 2, y = 3;
        while(y != 0){
            int temp = x & y;
            x = x ^ y;
            y = temp << 1;
        }
        System.out.print("Sum = "+x);
    }
}

/*
2 :  0010
3 :  0011
AND------
temp:0010

2 : 0010
3 : 0011
XOR------
    0001

Left Shift 1 times will Double temp






 */