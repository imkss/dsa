package a_Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class D_MultiAl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            mat.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat.get(i).add(sc.nextInt());
            }
        }
        System.out.println(mat);
    }
}
