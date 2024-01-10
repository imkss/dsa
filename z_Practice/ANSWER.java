//package z_Practice;
//
//import java.util.ArrayList;
//
//// THIS CLASS IS FOR DEBUGGING THE CODE WHICH I SOLVE ONLINE :)
//public class ANSWER{
//    public static void main(String[] args) {
////        ArrayList<Integer> ans = new ArrayList<>();
////        int[] arr = {3, 6, 7, 11};
////        System.out.println(finishTime(arr, 3));
////        System.out.println(maxi(arr));
////        int n = 3;
////        for(int i = 0; i < n; i++){
////            if(i == 0 || i == n - 1)
////                System.out.print("1");
////            else
////                System.out.print("0");
////        }
////        System.out.println();
//
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
//        int cnt = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(isPrime(arr[i])) cnt++;
//        }
//        System.out.print(cnt);
//
//    }
//
//    /*
//    public static int maxi(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for(int ele : arr) {
//            if(ele > max) {
//                max = ele;
//            }
//        }
//        return max;
//    }
//    */
//
//    /*
//    public static int finishTime(int[] arr, int hrs) {
//        int totalhrs = 0;
//        for (int j : arr) {
//            totalhrs += Math.ceil((double)j / (double)(hrs));
//        }
//        return totalhrs;
//    }
//     */
//
//    // Online Java Compiler
//// Use this editor to write, compile and run your Java code online
//
////    class HelloWorld {
////        public static void main(String[] args) {
////            int[] arr = {0,1,2,3,4,5,6,7,8,9};
////            int cnt = 0;
////            for(int i = 0; i < arr.length; i++) {
////                if(isPrime(arr[i])) cnt++;
////            }
////            System.out.print(cnt);
////        }
//
//        public static boolean isPrime(int n) {
//            boolean res = true;
//            if (n == 0 || n == 1) return false;
//            if (n == 2) return true;
//            for (int i = 2; i <= n / 2; i++) {
//                if(n % i == 0) return false;
//            }
//            return res;
//        }
//    }
//}
