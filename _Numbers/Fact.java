package _Numbers;

import java.math.BigInteger;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factRec(5));
        System.out.println(factIte(15));
        System.out.println(factBig(55));
    }
    public static long factIte(int n){
        long fac = 1;
        for(int i = 1; i <= n; i++){
            fac *= i;
        }
        return fac;
    }

    public static int factRec(int n) {
        if(n == 1) return 1;
        return factRec(n - 1) * n;
    }

    public static BigInteger factBig(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
