package _Arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Java program to insert an element at end of an Array.
public class InsEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            ans.add(arr[i]);
        }
        ans.add(sc.nextInt());
        System.out.println(ans);
    }
}
