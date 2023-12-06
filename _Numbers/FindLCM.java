package _Numbers;
import java.util.Scanner;
public class FindLCM {
    public static void main(String[] args) {

//        double num1,num2,maxNum;
//        System.out.println("Java Program to calculate LCM" );
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give first number");
//        num1= sc.nextDouble();
//        System.out.println("Please give second number");
//        num2 = sc.nextDouble();

        double num1 = 4, num2 = 2;
        double maxNum = Math.max(num1, num2);
        while (true) {
            if (maxNum % num1 == 0 && maxNum % num2 == 0) {
                System.out.println("LCM = "+maxNum );
                break;
            }
            ++maxNum;
        }
    }
}
