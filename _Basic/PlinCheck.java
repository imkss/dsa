package _Basic;
// A sentence is said to be a palindrome if we convert all its alphabets to lowercase,
// include the numerics but exclude all the spaces, whitespaces, and other special characters
// and it reads the same from left to right and right to left.
// For instance, consider the following sentence: “2 Race, e cAr 2”
// This sentence will be converted to “2race,ecar2”. The string is a palindrome,
// hence this sentence is a palindrome.
// You have to take a sentence input from the user and print “true” if it is a palindrome, or else print “false”.
public class PlinCheck {
    public static void main(String[] args) {
        String str = "2 Race, e cAr 2";
        String ans = str.toLowerCase();
        StringBuilder rmvSp = new StringBuilder();
        char[] chr = ans.toCharArray();
        for(char c: chr){
            if(!Character.isWhitespace(c)){
                rmvSp.append(c);
            }
        }
        System.out.println(rmvSp.reverse());
    }
}
