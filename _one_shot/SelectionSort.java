package _one_shot;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {17,15,1,32,18,9,74,11};

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
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Just to check the values after each iteration :)
            System.out.println();
            for (int num : arr) {
                System.out.print(num + " ");
            }

        }
        return arr;
    }
}
