package __TopInterview150.TwoPointer;
import java.util.Arrays;
public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 18;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] arr, int tar) {
        int[] ans = new int[2];
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            int sum = arr[l] + arr[r];
            if(sum == tar) {
                ans[0] = ++l;
                ans[1] = ++r;
            } else if(sum > tar) {
                r--;
            } else l++;
        }
        return ans;
    }
}
