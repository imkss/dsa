package _Basic;

import java.math.BigInteger;

public class Fact {
    public static void main(String[] args) {
        System.out.println(LargeFact(150));
        System.out.println(fact(20));
    }

    public static long fact(int num) { //Only handle factorial up-to 20, even if taking "long" :)
        long ans = 1;
        for(int i = 1; i <= num; i++){
            ans *= i;
        }
        return ans;
    }
    public static BigInteger LargeFact(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
