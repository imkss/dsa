package e_Recursion.Basic;

public class O_BS {
    public static void main(String[] args) {
        int[] arr = {1,32, 45, 123, 786};
        int target = 45;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target) return m;
        if(target < arr[m]) {
            return search(arr, target, s, m - 1);
        } else return search(arr, target, m + 1, e);
    }
}




