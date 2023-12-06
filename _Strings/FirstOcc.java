package _Strings;
import java.util.Arrays;
//Java program to Replace First Occurrence Of Vowel With `-` in String.
public class FirstOcc {
    public static void main(String[] args) {
        repVow("Engineer");
    }
    public static void repVow(String s) {
        String str = s.toLowerCase();
        char[] chr = str.toCharArray();
        String ans = "";
        for(int i = 0; i < chr.length; i++) {
            if(chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u'){
                chr[i] = '-';
                break;
            }
        }
        System.out.println(chr);
    }
}
