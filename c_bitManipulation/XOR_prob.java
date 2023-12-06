package c_bitManipulation;

public class XOR_prob {

	public static void main(String[] args) {

//int[] a = {81,1,3,2,81,2,17,1,3};
//OnlyNonRep(a);

int[] b = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
TwoNonRep(b);

	}
	
	public static void OnlyNonRep(int a[]) {
		int res = 0;
		for(int i = 0; i < a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println(res);
	}

	
	public static void TwoNonRep(int b[]) {
		int res = 0;
		int temp = 0;
		int x = 0;
		int y = 0;
		for(int i = 0; i < b.length; i++) {
			res = res ^ b[i];
			temp = res; 
			
			temp = temp ^ temp-1;
			
			if((b[i] & 1) != 1) {
				x = res ^ b[i];
				y = x ^ res;
			}
		}
		System.out.println(x);

		System.out.println(y);
	}
}
