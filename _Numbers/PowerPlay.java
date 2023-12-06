package _Numbers;

public class PowerPlay {
    public static void main(String[] args) {

        System.out.println(Math.pow(4.2, 2));
        System.out.println(pow(4, 2));
        System.out.println(sq(2) + " " + cube(2));
    }
    public static int pow(int x, int a){
        int ans = a;
        while(x > 1){
            ans *= a;
            x--;
        }
        return ans;
    }
    public static int sq(int n){
        return n * n;
    }
    public static int cube(int n){
        return n * n * n;
    }
}

//2^4