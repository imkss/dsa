package e_Recursion.Basic;

public class F_powerSet {

	public static void main(String[] args) {
		
		PowerSet("ABC", 0, "");
	}
	static void PowerSet(String str, int i, String cur) {
		if(i == str.length()) {
			System.out.print(cur + " ");
			return;
		}
		PowerSet(str, i+1, cur + str.charAt(i));
		PowerSet(str, i+1, cur);
	}
}
