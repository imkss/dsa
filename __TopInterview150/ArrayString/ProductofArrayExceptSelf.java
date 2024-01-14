package __TopInterview150.ArrayString;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    productExceptSelf(nums);
    System.out.println(Arrays.toString(nums));
    }

    public static void productExceptSelf(int[] arr) {
        int cntZero = 0;
        int pro = 1;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0){
                cntZero++;
            } else pro *= arr[i];
        }
        if(cntZero == 0) {
            for(int i = 0; i < n; i++) {
                arr[i] = pro/arr[i];
            }
        } else if (cntZero == 1) {
            for (int i = 0; i < n; i++) {
                if(arr[i] == 0){
                    arr[i] = pro;
                } else arr[i] = 0;
            }
        } else Arrays.fill(arr, 0);
    }
}
