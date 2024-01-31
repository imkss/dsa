package __A2Z.Strings;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s =  "the sky is blue";
        System.out.println(fnc(s));
    }

    public static String fnc(String str) {
       String[] s = str.split(" ");
       StringBuilder rev = new StringBuilder();
       for(int i = s.length - 1; i >= 0; i--) {
           rev.append(s[i]);
           rev.append(" ");
       }
       return rev.toString().trim();
    }
}
