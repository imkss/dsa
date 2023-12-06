package _Strings;
public class VowCon {
    public static void main(String[] args) {
        chkAlpha('a');
        chkAlpha('E');
        chkAlpha('7');
        chkAlpha('y');
    }
    public static void chkAlpha(char chr) {
        if (Character.isAlphabetic(chr)) {
            char c = Character.toLowerCase(chr);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Input is Vowel");
            }
            else System.out.println("Input is Consonant");
        }else
        {
            System.out.println("Input is not an Alphabet");
        }
    }
}
