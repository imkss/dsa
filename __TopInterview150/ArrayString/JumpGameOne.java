package __TopInterview150.ArrayString;

public class JumpGameOne {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1};
        System.out.println(fun(nums));
    }
    public static boolean fun(int[] arr) {
        int len = arr.length;
        int rea = 0;
        for(int i = 0; i < len; i++) {
            if(rea < i) {
                return false;
            }
            rea = Math.max(rea, arr[i] + i);
        }
        return true;
    }
}
