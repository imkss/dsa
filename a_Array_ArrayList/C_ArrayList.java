package a_Array_ArrayList;

import java.util.ArrayList;

public class C_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int data = 0; data < 10; data++) {
            arr.add(data);
        }
        System.out.println(arr);
        System.out.println(arr.contains(212));
        arr.add(3, 212);
        System.out.println(arr.hashCode());
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.set(0, 112));
        System.out.println(arr.remove(7));
        System.out.println(arr);
    }
}
