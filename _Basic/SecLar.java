package _Basic;

public class SecLar {
    public static void main(String[] args) {
        int[] arr = {12, 32, 21, 1, 54, 97};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i : arr) {
            if( i > max) {
                secMax = max;
                max = i;
            } else if (i > secMax) {
                secMax = i;
            }
        }
        System.out.println(secMax);
    }
}
