 package d_Mathematics;

public class E_ModuloArithnetics {

	public static void main(String[] args) {
		
		System.out.println(fastPower(1002, 5, 100000007));
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
