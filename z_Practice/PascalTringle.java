package z_Practice;
public class PascalTringle {
    public static void main(String[] args) {



        System.out.println("Element at the given position:: "+ nCr(6, 4));

        int n = 5;
        System.out.print("Elements are :: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nCr(n - 1, i) + " ");
        }

/*  OPTIMIZED */

        int row = 10;
        int ans = 1;
        System.out.print(ans + " ");
        for (int j = 1; j < row; j++) {
            ans = ans * ( row - j);
            ans = ans / j;
            System.out.print(ans + " ");
        }
    }
    static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * ( n - i);
            res = res / (i+1);
        }
        return res;
    }
}
