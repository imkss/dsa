package __A2Z.Strings;

public class IsomorphicStrings {
    public static void main(String[] args) {
    String s = "egg", t = "add";
        System.out.println(fnc(s, t));
    }

    public static boolean fnc(String ss, String tt) {
        if(ss.length() != tt.length()) return false; // If the length is not same then we cannot map. It's Simple!

        int[] ms = new int[256];    // Making two array to keep the count of the character, size here is 256 includes all ASCII values
        int[] mt = new int[256];    // Both are HASH ARRAY

        char[] s = ss.toCharArray(); // Converted to String type Array, coz manipulating the array are much faster than manipulating String
        char[] t = tt.toCharArray();

        for (int i = 0; i < s.length; i++) { //Traversing the hash array and checking if the value inside it are same or not!
            if (ms[s[i]] != mt[t[i]]) {  // Here, if the value of hash arrays are not equal then simply return false. WHY?
                return false;           // Coz, If the value differs means it already occurs previously...
            }
            ms[s[i]]++;             // Else simply increase the value by 1
            mt[t[i]]++;
        }
        return true;
    }
}
