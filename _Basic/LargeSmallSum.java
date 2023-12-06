package _Basic;

import java.util.Arrays;

public class LargeSmallSum {
public static void main(String[]args){
int [] arr = {3,2,1,7,5,4};

    System.out.println(LargeSmall(arr));

    }
    public static int LargeSmall(int[] arr) {
    if(arr.length <= 3) return 0;

    int[] odd = new int[arr.length / 2];
    int[] evn = new int[arr.length / 2];

    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) {
            evn[i / 2] = arr[i];
        } else {
        odd[i / 2] = arr[i];
        }
    }
    Arrays.sort(evn);
    Arrays.sort(odd);
    return (evn[evn.length-2] + odd[1]);
    }
}

