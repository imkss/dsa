package _Frameworks;

import java.util.HashMap;
import java.util.Map;

public class G_Map {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();
//        Map<String, Integer> num = new TreeMap<>();  // Sort WRT the Key

        num.put("one", 1);
        num.put("two", 22);
        num.put("three", 3);
        num.put("four", 4);
        num.put("five", 5);
        num.put("six", 6);
        System.out.println(num);
        num.put("two", 2);
        num.putIfAbsent("zero", 0);
        System.out.println(num);

        for(Map.Entry<String , Integer> e: num.entrySet()) {
//            System.out.println(e);
            System.out.println(e.getKey());
//            System.out.println(e.getValue());
        }
    }
}