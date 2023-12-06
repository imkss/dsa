package _Arrays;

//Write a program in Java for,
//How to find all pairs in array of integers whose sum is equal to given number.
//repeating an element is not allowed
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,6};
        int sum = 4;
        for(int i = 0; i <= arr.length; i++) {
            for(int j = i; j < arr.length;j++){
                if(arr[i] + arr[j] == sum && i != j){
                    System.out.println(arr[i] +", "+ arr[j]);
            }
            }
        }
    }
}
