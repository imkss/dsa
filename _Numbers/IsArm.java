package _Numbers;

public class IsArm {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        while(n > 0) {
            int dig = n % 10;
            sum += (int)Math.pow(dig, 3);
            n/=10;
        }
        if(temp == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
