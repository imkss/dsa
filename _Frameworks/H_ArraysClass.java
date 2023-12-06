package _Frameworks;

import java.util.Arrays;

public class H_ArraysClass {
    public static void main(String[] args) {
        int[] Searching = {1,20,300,4000,50000,600000,7000000,80000000,900000000};
        System.out.println(Arrays.binarySearch(Searching,50000));

        int[] Sorting = {8,2,6,0,3,4,9,7,5,1};
        Arrays.sort(Sorting);
        System.out.println(Arrays.toString(Sorting));
    }
}