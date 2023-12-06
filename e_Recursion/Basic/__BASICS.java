package e_Recursion.Basic;
public class __BASICS {
    public static void main(String[] args) {

//        Counting
        printNum(5);
        System.out.println();
        revCnt(5);
        concept(5);

//        Factorial
        System.out.println(fact(9 ));

//        Sum of Digit
        System.out.println(DigSum(13425));

//        Product of Digit
        System.out.println(DigPro(24));

//      Reverse a Number
        RevNum(1234);
        System.out.println(sum);

//    Count Zeros
        System.out.println(countZero(1002450));

    }

//        CONCEPT
        static void concept(int n) {
        if(n == 0) return;
        System.out.println(n);
//        concept(n--);  /* It first pass the old value the decrease */
        concept(--n);  /* It first decreases the value then pass */
    }

    static void revCnt(int num) {
        if(num == 0)
            return;
        System.out.println(num);
        revCnt(num - 1);
    }
    static void printNum(int num){
        if(num == 0)
            return;
        printNum(num-1);
        System.out.println(num);
    }
    static int fact(int num) {
            if(num <= 1) return 1;
            return num * fact(num - 1);
    }
    static int DigSum(int num) {
        if(num == 0) return 0;
        int sum = num % 10;
        return sum + DigSum(num/10);
    }
    static int DigPro(int num) {
        if(num % 10 == num)
            return num;
        int val = num % 10;
        return val * DigPro(num/10);
    }
    static int sum = 0;
    static void RevNum(int num) {
        if(num == 0) return;
        int rem = num % 10;
        sum = sum * 10 + rem;
        RevNum(num/10);
    }
    static int countZero(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int cnt) {
        if(num == 0) {
            return cnt;
        }
        if(num % 10 == 0) {
            return helper(num / 10, cnt + 1);
        } return helper(num / 10, cnt);
    }
}
