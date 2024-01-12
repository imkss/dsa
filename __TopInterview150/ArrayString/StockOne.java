package __TopInterview150.ArrayString;

public class StockOne {
    public static void main(String[] args) {
    int[] price = {7,1,5,3,6,4};
        System.out.println(MaxProfit(price));
    }
    public static int MaxProfit(int[] arr) {
        int len = arr.length;
        int profit = 0;
        int buy = arr[0];
        for(int i = 1; i < len; i++) {
            int inv = arr[i] - buy; // Bro, we can sell stock after we can buy it. Right!
            profit = Math.max(inv, profit); // We always invent on a profitable deal. Isn't it?
            buy = Math.min(arr[i], buy); // To make max profit, we should choose lowest price. Got it.
        }
        return profit;
    }
}
