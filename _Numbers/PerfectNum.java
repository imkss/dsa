package _Numbers;
// A perfect number is a positive integer
// that is equal to the sum of its positive divisors, excluding the number itself.
// For instance, 6 has divisors 1, 2 and 3 (excluding itself),
// and 1 + 2 + 3 = 6, so 6 is a perfect number.
public class PerfectNum {
    public static void main(String[] args) {
        int n = 33550336;
        int cnt = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0){
                cnt += i;
            }
        }
        if(cnt == n) System.out.println("Yes");
        else System.out.println("No");
    }
}
