package e_Recursion.Array;

public class Sorted {
    public static void main(String[] args) {
    int[] arr = {11, 3, 4, 12, 26};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted (int[] arr, int i){
        if (i == arr.length - 1) {
            return true;
        }
        return(arr[i] < arr[i+1] && isSorted(arr, i + 1));
    }
}
