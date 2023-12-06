package z_Practice;

public class KadansAlgo {
    public static void main(String []args) {
        int[] arr = {2, -3, 14, -1, 2, 1, -16, 13};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum sub-array sum is: " + maxSum);

    }
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                end = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(start + " " + end);
            System.out.print("The possible subarray with maximum sum:: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        // To consider the sum of the empty subarray
        if (maxi < 0) maxi = 0;

        return maxi;
    }

}
