package __A2Z.Strings;

public class LargestOddNumberString {
    public static void main(String[] args) {
        String nums = "2342";
        System.out.println(fnc(nums));
    }

    public static String fnc(String num){
        for(int i = num.length() - 1; i >= 0; i--) {
            int cur = num.charAt(i) - '0';
            if(cur % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
