package a_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class A_RowColFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][4];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
// OUTPUT: By using For each Loop

        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

// OUTPUT: By Array.ToString method
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
