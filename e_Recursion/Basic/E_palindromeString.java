package e_Recursion.Basic;

public class E_palindromeString {

	public static void main(String[] args) {

		System.out.println(isPalin("abca", 0, 2));
	}

	static boolean isPalin(String str, int l, int r) {
		if(l >= r)
			return true;
		if(str.charAt(l) != str.charAt(r))
			return false;
		return isPalin(str, l+1, r-1);
	}
}
