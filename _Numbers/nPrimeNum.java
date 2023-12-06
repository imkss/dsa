package _Numbers;

import java.util.ArrayList;
public class nPrimeNum {
    public static void main(String[] args) {
        System.out.println(nPrime(10));
    }
    public static ArrayList<Integer> nPrime(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
            for (int i = 3; i < n * n; i += 2){
                boolean isP = true;
                for(Integer num: lst){
                    if(i % num == 0){
                        isP= false;
                        break;
                    }
                }
                if(isP) lst.add(i);
                if(lst.size() == n) break;
            }
        return lst;
    }
}
