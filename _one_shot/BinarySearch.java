package _one_shot;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {2, 4, 5, 8, 12, 46, 98};
        int target = 88;

        int targetIndex = findPosition(nums, target);

        if(targetIndex != -1) {
            System.out.println(target + " found at index " + targetIndex);
        } else {
            System.out.println(target + " does not exist in the dataset.");
        }

        System.out.println("Searching " +target+" with recursive binary search :: "
                + findPositionRecursively(nums, target, 0, nums.length-1));
    }

    public static int findPosition(int[] arr, int tar) {
        int steps = 0;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            steps++;
            int mid = (start + end) / 2;

            if(arr[mid] == tar) {
                System.out.println("Steps take by binary search " + steps);
                return mid;
            } else if (arr[mid] >= tar) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Steps take by binary search " + steps);
        return -1;
    }

    public static int findPositionRecursively(int[] arr, int tar, int start, int end){
        if(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == tar) {
                return mid;
            } else if (arr[mid] >= tar) {
                findPositionRecursively(arr, tar, start, mid -1);
            } else {
                findPositionRecursively(arr, tar, mid + 1, end);
            }
        }
        return -1;
    }
}
