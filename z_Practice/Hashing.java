package z_Practice;

import java.util.*;
public class Hashing {

//  FOR ARRAYS

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int hash[] = new int [13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        int q = sc.nextInt();
        while (q > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
            q--;
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String S = sc.nextLine();
////        PreCompute
//        int hash[] = new int[26];
//        for (int i = 0; i < S.length(); i++) {
//            hash[S.charAt(i) - 'a']++; // Here it's getting Subtracting by 'a' coz we are only considering small alphabets only. If we want to take the entire character then we simply remove the subtracting part and also increase the hash array size to 256 from 26.
//        }
//        int q = sc.nextInt();
//        while (q > 0) {
//            char c = sc.next().charAt(0);
////            fetch
//            System.out.println(hash[c-'a']);
//            q--;
//        }
//
//    }


//    Map funda is not clear though :)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//Map <Integer,Integer> map = new HashMap <Integer,Integer>();
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            map[arr[i]]++;
//        }
//        int q = sc.nextInt();
//        while (q > 0) {
//            int number = sc.nextInt();
//            System.out.println(map[number]);
//            q--;
//        }
//    }

}
