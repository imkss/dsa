package _Numbers;

public class MinOfThree {
    public static void main(String[] args) {
        int a = 12, b = 54, c = 89;
        int min = Math.min(c, Math.min(b, a));
        System.out.println(min);
    }
}
