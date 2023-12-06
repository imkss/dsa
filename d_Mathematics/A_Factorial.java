package d_Mathematics;

public class A_Factorial {

	public static void main(String[] args) {
		Find_Factorial(20);
//		NoOfTrailingZeros(121);
	}

	public static void Find_Factorial(int num) {
		long fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+ " is "+fact);
	}
	
	public static void NoOfTrailingZeros(int num) {
		int res = 0;
		for(int i = 5; i <= num; i = i*5) {
			res = res + (num/i);
		}
		System.out.println("There are "+res+" trailing zeros in factorial of "+num);
	}
}
