package _Arrays;

import java.util.Arrays;

//Write a program in Java for,
//Given two arrays 1,2,3,4,5 and 2,3,1,0,5
//find which number is not present in the second array.
public class GetAbs {
    public static void main(String[] args) {
     int[] a = {1,2,3,0,5};
     int[] b = {2,3,1,8,5};
     int abs = 0;
        for(int i = 0; i < a.length; i++) {
           abs += a[i] - b[i];
        }
        System.out.println(Math.abs(abs));
    }
}
