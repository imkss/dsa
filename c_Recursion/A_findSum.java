package c_Recursion;

public class A_findSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindSum(100));
	}
	
	public static int FindSum(int num) {
		if(num == 1) 
			return 1;
		return num + FindSum(num-1);
	}

}
