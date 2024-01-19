package __TopInterview150.TwoPointer;

public class IsSubsequence {
    public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "ahbgdc";
        System.out.println(func(str1,  str2));
    }
    public static boolean func(String a, String b) {
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        int i = 0, j = 0;

        while(i < a.length() && j < b.length()) {
            if(s1[i] == s2[j]) {
                i++;
                j++;
            } else j++;
        }
        if(i == s1.length) return true;
        else return false;
    }
}
