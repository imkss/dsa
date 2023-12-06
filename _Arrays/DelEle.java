package _Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class DelEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int pos = sc.nextInt();
        System.out.println(del(arr, pos));
    }
    public static ArrayList<Integer> del(int[] arr, int pos){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        ans.remove(pos);
        return ans;
    }
}
