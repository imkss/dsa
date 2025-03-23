package _one_shot;

public class LinearSearch {

    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 43, 21, 67};
        int target = 56;

        int targetIndex = findPosition(nums, target);

        if(targetIndex != -1) {
            System.out.println(target + " found at index " + targetIndex);
        } else {
            System.out.println(target + " does not exist in the dataset.");
        }

    }

    public static int findPosition(int[] arr, int tar) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if(arr[i] == tar) {
                System.out.println("Steps take by linear search " + steps);
                return i;
            }
        }
        System.out.println("Steps take by linear search " + steps);
        return -1;
    }
}
