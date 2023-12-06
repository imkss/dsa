package _Numbers;
public class SumOfDig {
    static int sum=0,rem;
    public static void main(String[] args) {
        int n = 4259;
        SumIte(n);

        System.out.println(SumRec(n));
    }
    public static void SumIte(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num%10;
            num/=10;
        }
        System.out.println(sum);
    }
    public static int SumRec(int num) {
        sum = sum + (num%10);
        rem = num/10;
        if(rem > 0)
        {
            SumRec(rem);
        }
        return sum;
    }
}

// 459 : 18