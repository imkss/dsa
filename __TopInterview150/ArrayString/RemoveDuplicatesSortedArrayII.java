package __TopInterview150.ArrayString;

public class RemoveDuplicatesSortedArrayII {
    public static void main(String[] args) {
        int[]arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums) {
            if(i < 2 || n != nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
