package _Numbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:: ");
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.print("This is Odd Number.");
        else System.out.print("This is Even Number.");
    }
}
