package e_Recursion.Basic;

public class G_findPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permute("abc", 0, 3);

	}
	public static void Permute(String str, int l, int r) {
			if(l == r) {
				System.out.println(str);
			}
								
			for(int i = l; i <= r; i++) {
				str = swap(str, l, i);
				Permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	
	  static String swap(String str, int i, int j){
	        if (j == str.length() - 1)
	            return str.substring(0, i) + str.charAt(j)
	                + str.substring(i + 1, j) + str.charAt(i);
	 
	        return str.substring(0, i) + str.charAt(j)
	            + str.substring(i + 1, j) + str.charAt(i)
	            + str.substring(j + 1, str.length());
	    }
}
