package _Strings;
//Java program to count alphabets, digits and special characters.
public class CntAllType {
    public static void main(String[] args) {
    cntAll("Victus@69");
    }
    public static void cntAll(String str) {
        int a = 0, d = 0;
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if(Character.isAlphabetic(chr[i])) a++;
            else if(Character.isDigit(chr[i])) d++;
        }
        System.out.println("Digit " + d);
        System.out.println("Alphabet " + a);
        System.out.println("Character " + (str.length() - (a + d)));
    }
}
