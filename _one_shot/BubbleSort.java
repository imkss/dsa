package _one_shot;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {6,15,1,32,18,9,74,11};

        System.out.println("Before sorting:: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        sortValues(nums);

        System.out.println();
        System.out.println("After sorting:: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static int[] sortValues(int[] arr) {
        int temp = 0;

        for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < arr.length - 1; j++) {
               if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
// Just to check the values after each iteration :)
            System.out.println();
            for(int num : arr){
                System.out.print(num + " ");
            }
        }
        return arr;
    }
}
