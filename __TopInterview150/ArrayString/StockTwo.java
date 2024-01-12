package __TopInterview150.ArrayString;

public class StockTwo {
    public static void main(String[] args) {
    int[] price = {7,1,5,3,6,4};
        System.out.println(MaxProfit(price));
    }
    public static int MaxProfit(int[] arr) {
        int profit = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}
