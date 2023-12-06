package _Basic;

public class RmvSpace {
    public static void main(String[] args) {
        String str = "Kumar Sunny Suman";
        StringBuilder ans = new StringBuilder();
        char[] chr = str.toCharArray();
        for(char c: chr){
            if(!Character.isWhitespace(c)){
                ans.append(c);
            }
        }
        System.out.println(ans);
    }
}
