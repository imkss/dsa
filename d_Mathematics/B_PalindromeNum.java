package d_Mathematics;

public class B_PalindromeNum {

	public static void main(String[] args) {

		CheckPalindrome(440044);
	}
	
	public static void CheckPalindrome(int num) {
		int temp = num;
		int rev,sum = 0;
		
		while(num > 0) {
			rev = num % 10;
			sum = (sum *10) + rev;
			num = num/10;
		}
		
		if(temp == sum) 
			System.out.println("Palindrome");
		else System.out.println("Not Plindrome");
	}

}
