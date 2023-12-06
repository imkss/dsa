package _Frameworks;

import java.util.HashSet;
import java.util.Set;

public class F_Set {
    public static void main(String[] args) {

        Set<Integer> unq = new HashSet<>();
//        Set<Integer> unq = new LinkedHashSet<>(); // It preserve the arrangement of input
//        Set<Integer> unq = new TreeSet<>(); // It also Sort the element

        /*
        unq.add(15);
        unq.add(15);
        unq.add(45);
        unq.add(26);
        unq.add(89);
        unq.add(53);
        unq.add(37);
        System.out.println(unq);
        unq.remove(53);
        System.out.println(unq.contains(53));
        System.out.println(unq.isEmpty());
        unq.clear();
        System.out.println(unq);
        */

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        for (int i = 0; i < nums.length; i++) {
            unq.add(nums[i]);
        }
        System.out.println(unq);
        System.out.println(unq.size());
    }
}