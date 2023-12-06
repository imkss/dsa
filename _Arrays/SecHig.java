package _Arrays;
import java.util.Arrays;
public class SecHig {
    public static void main(String[] args) {
        int[] arr = {12, 32, 54, 21, 56, 76};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}