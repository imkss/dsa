package _Basic;

public class PeakEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 10, 7, 12, 13, 8, 5};
//        int[] arr = {1,2,3};
        System.out.println(peakElement(arr, 9));
    }

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int ind=-1,max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                ind=i;
                max=arr[i];
            }
        }
        return ind;
    }
}
