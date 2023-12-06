package e_Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
    int[] nums = {48, 12, 4, 19, 19, 64};
        System.out.println(LS(nums, 19, 0));
        System.out.println(FindInd(nums, 19, 0));
        System.out.println(FindIndLast(nums, 19, nums.length - 1));
        FindAllInd(nums, 19, 0);
        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList<>();
        FindAllInd2(nums, 19, 0, ans);
        System.out.println(ans);

        System.out.println(FindAllInd3(nums, 19, 0));
    }
static boolean LS(int[] arr, int target, int ind) {
        if(ind == arr.length) return false;
        return arr[ind] == target || LS(arr, target, ind + 1);
}

static int FindInd(int[] arr, int tar, int ind) {
        if(ind == arr.length) return -1;
        if(arr[ind] == tar) return ind;
        else return FindInd(arr, tar, ind + 1);
}

    static int FindIndLast(int[] arr, int tar, int ind) {
        if(ind == -1) return -1;
        if(arr[ind] == tar) return ind;
        else return FindIndLast(arr, tar, ind - 1);
}

    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllInd(int[] arr, int tar, int ind) {
        if(ind == arr.length) return;
        if(arr[ind] == tar){
            list.add(ind);
        }
        FindAllInd(arr, tar, ind + 1);
    }

    static ArrayList<Integer> FindAllInd2(int[] arr, int tar, int ind, ArrayList<Integer> list ) {
        if(ind == arr.length) return list;
        if(arr[ind] == tar){
            list.add(ind);
        }
        return FindAllInd2(arr, tar, ind + 1, list);
    }

    static ArrayList<Integer> FindAllInd3(int[] arr, int tar, int ind) {
        ArrayList<Integer> list = new ArrayList<>();
        if(ind == arr.length) return list;
//        This will contain answer for that function call only :)
        if(arr[ind] == tar){
            list.add(ind);
        }
        ArrayList<Integer> ansFromBelowCalls = FindAllInd3(arr, tar, ind + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
