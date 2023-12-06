package _Numbers;
//Write a program to reverse an integer in Java.
public class RevNum {
    public static void main(String[] args) {
        int num = 48754;
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}
