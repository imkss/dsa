package z_Practice;

import java.util.Arrays;

public class RandomQns {
    public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int temp = nums[0];
    for(int i = 1; i < nums.length; i++) {
        nums[i-1] = nums[i];
    }
    nums[nums.length -1] = temp;
        System.out.println(Arrays.toString(nums));
    }

}
