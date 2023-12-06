package _Basic;
public class MaxOcc {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3};
        int n = arr.length;
        System.out.print(freq(arr, n));
    }
    public static int freq(int[] arr, int n){
        int max_count = 0;
        int maxfreq = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_count = count;
                maxfreq = arr[i];
            }
        }
        return max_count;
    }
}
