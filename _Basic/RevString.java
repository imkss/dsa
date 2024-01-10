package _Basic;

public class RevString {
    public static void main(String[] args) {
        String str = "Sunny";
        System.out.println(Printreverse(str));
    }

    public static String Printreverse(String str){
        if(str == null) return "NULL";
        StringBuilder rev = new StringBuilder();
        char[] chr = str.toCharArray();
        for (int i = chr.length - 1; i >= 0; i--) {
            rev.append(chr[i]);
        }
        return rev.toString();
    }
}
