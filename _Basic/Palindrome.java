package _Basic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPali("aba"));
    }
    public static boolean checkPali(String str) {
        boolean res = true;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
