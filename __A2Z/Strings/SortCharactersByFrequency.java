package __A2Z.Strings;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
    String str = "tree";
        System.out.println(func(str));
    }

    static class Pair{
        char ch;
        int cnt;
        Pair(char ch, int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }

    public static String func(String str) {
        int[] arr = new int[125];
        for(char ch : str.toCharArray()) {
            arr[ch]++;
        }
        LinkedList<Pair> freq_list = new LinkedList<>();

        for(int i = 48; i < 125; i++) {
            if(arr[i] > 0){
                freq_list.add(new Pair((char)i, arr[i]));
            }
        }
        Collections.sort(freq_list, new Comparator<Pair>(){
            public int compare(Pair a, Pair b) {
                return b.cnt - a.cnt;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Pair p : freq_list){
            int cnt = p.cnt;
            while (cnt -- > 0) {
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
}
