package __A2Z.Strings;
public class MaximumNestingDepthParentheses {
    public static void main(String[] args) {
    String str = "(1+(2*3)+((8)/4))+1";
        System.out.println(fnc(str));
    }
    public static int fnc(String s){
        int cur = 0;
        int max = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') cur++;
        max = Math.max(cur, max);
            if(c == ')') cur--;
        }
        return max;
    }
}
