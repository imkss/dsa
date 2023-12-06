package _Numbers;

import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        int year;
        System.out.println("Java Program to Check Year is leap or not" );
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give the Year: ");
        year= sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Given year "+ year +" is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println("Given year "+ year +" is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println("Given year "+ year +" is a leap year.");
        }
        else {
            System.out.println("Given year "+ year +" is not a leap year.");
        }
    }
}
