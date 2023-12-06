package _Basic;

//Employee in the building.
//The system records every swipe
//capturing the first swipe of an ID as in
//second as out, third as in, and so on...
//Example: 1 2 2 1 3 1 => [1, 3]

import java.util.HashSet;

public class UnqOddCh {
    public static void main(String[] args) {
        String str = "1213823594844231";
        char[] chr = str.toCharArray();
        HashSet<Character> ans = new HashSet<>();
        for(char c: chr){
            if(ans.contains(c)){
                ans.remove(c);
            }else{
                ans.add(c);
            }
        }
        System.out.println(ans);
    }
}
