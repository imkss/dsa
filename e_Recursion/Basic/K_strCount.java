package e_Recursion.Basic;

public class K_strCount {
    public static void main(String[] args) {
        String str = "Sunny";
        System.out.println(strLen(str));
    }
        public static int strLen(String str) {
        if(str.equals("")) return 0;
        return strLen(str.substring(1)) + 1;
        }
}
