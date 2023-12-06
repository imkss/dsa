package e_Recursion.String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//    subseq("", "abc");

        ArrayList<String> ans = new ArrayList<>();
        System.out.println(subseq("", "abc",ans ));

        System.out.println(subseqRet("", "abc"));

    }

    static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    ArrayList<String> ans = new ArrayList<>();
    static ArrayList<String> subseq(String p, String up, ArrayList<String> ans) {
        if(up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1), ans);
        subseq(p, up.substring(1), ans);
        return ans;
    } 

    static ArrayList<String> subseqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
