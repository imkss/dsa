 package b_Mathematics;

public class E_ModuloArithnetics {

	public static void main(String[] args) {
		
		System.out.println(findPower(12, 5));
		
		System.out.println(fastPower(1002, 5, 100000009));
	}
	
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
	
	static long fastPower(long a, long b, int n ) {
		long res = 1;
		
		while(b > 0) {			
			if((b & 1) == 1) {
				res = (res % n * a % n) %n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;			
		}
		
		return res;
	}
	
}
