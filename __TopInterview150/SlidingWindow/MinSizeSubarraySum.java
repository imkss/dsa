package __TopInterview150.SlidingWindow;

public class MinSizeSubarraySum {
    public static void main(String[] args) {
    int[] nums = {2,3,1,2,4,3};
    int tar = 7;

        System.out.println(func(nums, tar));
    }

    public static int func (int[] arr, int tar) {
        int start = 0;
        int sum = 0;
        int subArryLen = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while(sum >= tar) {
                subArryLen = Math.min(subArryLen, i + 1 - start);
                sum -= arr[start];
                start++;
            }
        }
        if(subArryLen != Integer.MAX_VALUE) return subArryLen;
        return 0;
    }
}
