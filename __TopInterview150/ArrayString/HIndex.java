package __TopInterview150.ArrayString;

public class HIndex {
    public static void main(String[] args) {
    int[] citations = {3,0,6,1,5};
        System.out.println(func(citations));
    }
    public static int func (int[] arr) {
        int len = arr.length;
        int[] hash = new int [len + 1];
        for(int i : arr) {
            if(i > len){
            hash[len]++;
            } else{
                hash[i]++;
            }
        }
        int count = 0;
        for(int i = len; i >= 0; i--) {
            count += hash[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}
