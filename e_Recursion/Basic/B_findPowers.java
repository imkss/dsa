package e_Recursion.Basic;

public class B_findPowers {

	public static void main(String[] args) {

		System.out.println(FindPower(2, 8));
		
		System.out.println(findPower(2, 8));

	}
 
	/*   time complexity  O(N)  */
	
	public static int FindPower(int a, int b) {
		if(b == 0)
			return 1;
		return a * FindPower(a, b-1);
	}
	
	/*   time complexity  O(log N)  */
	
	static int findPower(int a, int b) {
		int res = 1;
		
		while(b > 0) {			
			if((b & 1) == 1) {
				res = res * a;
			}
			a = a * a;
			b = b >> 1;			
		}
		
		return res;
	}
}
