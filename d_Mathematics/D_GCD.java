package d_Mathematics;

public class D_GCD {

	public static void main(String[] args) {

		System.out.println(gcd(24,12));
		System.out.println(24%12);

	}
	
	static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a %b);
	}
}
