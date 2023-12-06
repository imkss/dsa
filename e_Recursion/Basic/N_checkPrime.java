package e_Recursion.Basic;

public class N_checkPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(45, 2));
    }

    public static boolean isPrime(int num, int curDiv) {
        if(num == 2) return true;
        if(num < 2) return false;
        if(num % curDiv == 0) return false;
        if(curDiv * curDiv > num) return true;
        return isPrime(num, curDiv + 1);
    }
}
