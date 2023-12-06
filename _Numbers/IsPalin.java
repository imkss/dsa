package _Numbers;

import org.jetbrains.annotations.NotNull;

//A palindrome is a word, phrase, number, or sequence of symbols
//that reads the same backwards as forwards.
//For example, "racecar," "radar," "stats," "eye," and "Mom" are all palindromes.
public class IsPalin {
    public static void main(String[] args) {
        String str = "racecar";
        PaliIte(str);
        System.out.println(PaliRec(str, 0, str.length() - 1));
    }
    public static void PaliIte(@NotNull String str) {
        int chk = 0;
        char[]chr = str.toCharArray();
        for(int i = 0; i < chr.length/2; i++) {
            if(chr[i] != chr[chr.length - i -1]){
                chk++;
                break;
            }
        }
        if(chk == 0) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean PaliRec(String str, int l, int r) {
        if(l >= r)
            return true;
        if(str.charAt(l) != str.charAt(r))
            return false;
        return PaliRec(str, l+1, r-1);
    }
}
