package __TopInterview150.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(func(height));
    }
    public static int func(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int maxArea = 0;
        while(l < r) {
            int curArea = Math.min(arr[l], arr[r]) * (r - l);
            maxArea = Math.max(maxArea, curArea);
            if(arr[l] < arr[r]) l++;
            else r--;
        }
        return maxArea;
    }
}