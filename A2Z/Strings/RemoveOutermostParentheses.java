package A2Z.Strings;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
    String  s = "(()())(())(()(()))";
        System.out.println(fnc(s));
    }
    public static String fnc(String s) {
        StringBuilder ans = new StringBuilder();
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
               a++;
               if(a > 1)
                   ans.append('(');
            } else {
                if(a > 1)
                    ans.append(')');
                    a--;
            }
        }
        return ans.toString();
    }
}
