package e_Recursion.Basic;

public class L_sumOfDig {

    public static void main(String[] args) {
        System.out.println(SumOfDigit(12458));
    }

    public static int SumOfDigit (int num) {
        if(num == 0) return num;
        return num % 10 + SumOfDigit(num / 10);
    }
}
