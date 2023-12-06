package _Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        if(str1.length() != str2.length()) {
            System.out.println("no");
        } else{
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if(status) System.out.println("yes");
        else System.out.println("no");
        }
    }
