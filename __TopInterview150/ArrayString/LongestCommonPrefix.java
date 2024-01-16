package __TopInterview150.ArrayString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
        System.out.println(func(strs));
    }

    public static String func (String[] arr){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int ind = 0;
        while(ind < first.length() && ind < last.length()){
            if(first.charAt(ind) == last.charAt(ind)){
                ind++;
            } else break;
        }
        return first.substring(0, ind);
    }
}
