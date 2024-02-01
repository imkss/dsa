package __A2Z.Strings;

public class RotateString {

    public static void main(String[] args) {
    String str = "abcde";
    String goal = "cdeab";
        System.out.println(fnc(str, goal));
    }

    public static boolean fnc(String s, String g) {
        if(s.length() != g.length()) return false; //Simply, If the length is not equal then how can it be same!
        String chk = s + s; // Bro, here we are finding all the possible rotation combination of s.
        return chk.contains(g); // Checking if g contains in the chk or not :)
    }
}
