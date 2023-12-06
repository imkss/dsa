package _Arrays;
public class FindSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int cnt = 0;
        int evn = 0;
        for(int j : arr) {
            cnt += j;
            if(j % 2 == 0){
                evn += j;
            }
        }
        System.out.println("Total Sum "+cnt+"\nEven Sum "+evn+"\nOdd Sum "+(cnt-evn));
    }
}
