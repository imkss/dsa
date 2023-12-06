package a_Array_ArrayList;

public class B_RowColNoFix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {8,7},
                {0,6,5}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
