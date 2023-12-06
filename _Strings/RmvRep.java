package _Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RmvRep {
    public static void main(String[] args) {
        repRmv("Kumar Sunny Suman");

/*
        System.out.println("Java program to remove duplicate character");
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int len = str.length();
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len;j++){
                if(ch[i] == ch[j]){
                    for(int k=j; k<len-1; k++){
                        ch[k] = ch[k+1];
                    }
                    len--;
                    j--;
                }
            }
        }
        System.out.println("After removing duplicate character");
        for(int i=0;i<len;i++){
            System.out.print(ch[i]);
        }
        */

    }
    public static void repRmv(String str) {
        Set<Character> ans = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++) {
            ans.add(str.charAt(i));
        }
        StringBuilder s = new StringBuilder();
        for(Character c : ans) {
            s.append(c);
        }
        String fin = s.toString();
        System.out.println(fin);
    }
}