package e_Recursion.String;

import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
//    dice("", 4);
        System.out.println(diceList("", 4));
    }

    static void dice(String p, int t) {
        if(t == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= t; i++) {
            dice(p + i, t - i);
        }
    }

    static ArrayList<String> diceList(String p, int t) {
        if(t == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= t; i++) {
            list.addAll(diceList(p + i, t - i));
        }
        return list;
    }
}
