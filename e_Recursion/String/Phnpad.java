package e_Recursion.String;

import java.util.ArrayList;

public class Phnpad {
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
    }
static ArrayList<String> pad (String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list. add (p);
            return list;
        }
        int dig = up.charAt(0) - '0';
    ArrayList<String> list = new ArrayList<>();
    for (int i = (dig - 1) * 3; i < dig * 3; i++) {
        char ch = (char) ('a' + i);
        list.addAll(pad(p + ch, up.substring(1)));
    }
    return list;
    }
}