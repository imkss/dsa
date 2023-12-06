package e_Recursion.Basic;

public class A_findSum {

	public static void main(String[] args) {
		System.out.println(FindSum(10));
	}
	
	public static int FindSum(int nums) {
	if(nums == 0) return 0;
	else return nums + FindSum(nums-1);
	}
}
