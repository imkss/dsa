package __TopInterview150.TwoPointer;
public class ValidPalindrome {
    public static void main(String[] args) {
    String str = "0A man, a plan, a canal: Panama";
        System.out.println(func(str));
    }

    public static boolean func(String s) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toLowerCase().toCharArray();
        for(int i = 0; i < str.length; i++) {
            if(Character.isAlphabetic(str[i]) ||
str[i] == '0' || str[i] == '1' || str[i] == '2' || str[i] == '3' || str[i] == '4'
|| str[i] == '5' || str[i] == '6' || str[i] == '7' |str[i] == '8' || str[i] == '9') {
                sb.append(str[i]);
            }
        }
        int r = sb.length() - 1;
        for(int i = 0; i < str.length / 2; i++) {
            if(sb.charAt(i) != sb.charAt(r)){
                return false;
            } else {
                r--;
            }
        }
        return true;
    }
}
