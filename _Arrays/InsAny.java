package _Arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Java program to insert element at a given location in Array.
public class InsAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int pos = sc.nextInt();
        int val = sc.nextInt();
        System.out.println(ins(arr, pos, val));
    }
    public static ArrayList<Integer> ins(int[] arr, int pos, int val){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        ans.add(pos, val);
        return ans;
    }
}
