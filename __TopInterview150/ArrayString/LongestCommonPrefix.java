package __TopInterview150.ArrayString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
        System.out.println(func(strs));
    }

    public static String func (String[] arr){
        Arrays.sort(arr);  //First of all we sorted the String array, it will simply help us find the common prefix
        String first = arr[0]; // Here we are taking the first indexed String
        String last = arr[arr.length - 1]; // Here taking the last indexed String
        int ind = 0; // Pointer which will be helping to find the common element
        while(ind < first.length() && ind < last.length()){ //Loop until any one of the String exhausted
            if(first.charAt(ind) == last.charAt(ind)){ // If character of l == r then simply
                ind++;                                 // increase the index value
            } else break;                              // If not the just break.
        }
        return first.substring(0, ind); //Finally, use substring method to trim down the common character which will be from 0 to ind.
    }
}
