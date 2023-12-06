package _Basic;
//    Write a program in Java to Toggle the case of every character of a string.
//    For instance, if the input string is “ApPLe”, the output should be “aPplE”.
//    Input: Ab#$Cd
//    Output: aB#$cD
public class SwitchCase {
    public static void main(String[] args) {
        String str = "Ab#$Cd";
        StringBuilder ans = new StringBuilder();
        char[] chr = str.toCharArray();
        for(char c : chr){
                if(Character.isLowerCase(c)){
                    ans.append(Character.toUpperCase(c));
                } else {
                    ans.append(Character.toLowerCase(c));
                }
        }
        System.out.println(ans);
    }
}
