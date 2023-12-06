package e_Recursion.String;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//    per("", "abc");

//        ArrayList<String> ans = perList("", "abc");
//        System.out.println(ans);

        System.out.println( perCnt("", "abcd"));

    }
    static void per(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
         for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            per(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> perList(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(perList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int perCnt(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        int cnt = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            cnt += perCnt(f + ch + s, up.substring(1));
        }
        return cnt;
    }
}