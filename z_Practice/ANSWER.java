package z_Practice;

import java.util.ArrayList;

// THIS CLASS IS FOR DEBUGGING THE CODE WHICH I SOLVE ONLINE :)
public class ANSWER{
    public static void main(String[] args) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int[] arr = {3, 6, 7, 11};
//        System.out.println(finishTime(arr, 3));
//        System.out.println(maxi(arr));
        int n = 3;
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n - 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();

    }

    /*
    public static int maxi(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr) {
            if(ele > max) {
                max = ele;
            }
        }
        return max;
    }
    */

    /*
    public static int finishTime(int[] arr, int hrs) {
        int totalhrs = 0;
        for (int j : arr) {
            totalhrs += Math.ceil((double)j / (double)(hrs));
        }
        return totalhrs;
    }
     */
}
