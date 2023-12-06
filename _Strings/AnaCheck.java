package _Strings;
public class AnaCheck {
    public static void main(String[] args) {
        System.out.println(IsAna("RAM", "MAR"));
        System.out.println(chkAna("RAM", "MiAR"));
    }
    public static boolean IsAna(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length != c2.length) return false;
        for (int i = 0; i < c1.length; i++){
            if(c1[i] != c2[c2.length - i -1]) return false;
        }
        return true;
    }

    public static boolean chkAna(String str1, String str2) {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(s2.length() - i - 1)) return false;
        }
        return true;
    }
}
