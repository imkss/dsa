package _Basic;
public class StringWithVowels {
    public static void main(String[] args) {
        String str = "My name is Sunny. I am Indian.";
        System.out.println(stringContainsVowels(str));
        System.out.println(checkVowels(str));
    }
    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static boolean checkVowels(String input) {
        boolean ans = false;
        String str = input.toLowerCase();
        char[] chr = str.toCharArray();
        for (char c : chr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
