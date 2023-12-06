package _Numbers;

import java.util.ArrayList;

public class PrimeRange {
    public static void main(String[] args) {
        System.out.println(primeList(11, 51));
    }
    public static ArrayList<Integer> primeList(int s, int e) {
        ArrayList<Integer> lst = new ArrayList<>();
        while(s <= e) {
            int temp = 0;
            for(int i = 2; i < s/2; i = i + 2){
                if(s % 2 == 0){
                    temp++;
                    break;
                }
            }
            if(temp == 0) lst.add(s);
            s++;
        }
        return lst;
    }
}
