package e_Recursion.Basic;

public class C_MatrixProb {

	public static void main(String[] args) {
		System.out.println(countPath(40,10));
	}
	
	public static long countPath(int n, int m) {
		if(n == 1 || m == 1) 
			return 1;
		else return countPath(n-1, m) + countPath(n, m-1);
	}

}
