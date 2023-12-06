package _Arrays;
import java.util.ArrayList;
import java.util.Arrays;

//Write a program in Java for,
//In a array 1-100 multiple numbers are duplicates,
//how do you find it.
public class FindDup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10, 1, 1, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20, 21, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 65, 66, 67, 16, 16, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 86, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 100};
        Arrays.sort(arr);
        ArrayList<Integer> dup = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){
                dup.add(arr[i]);
            }
        }
        System.out.println(dup);
    }
}
