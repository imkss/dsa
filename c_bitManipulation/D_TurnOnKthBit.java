package c_bitManipulation;

public class D_TurnOnKthBit {

	public static void main(String[] args) {
		 int n = 11;
	        int k = 3;
	        n = turnOnKthBit(n, k);
	        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
		}
		
		 public static int turnOnKthBit(int n, int k) {
			  System.out.println(n + " in binary is " + Integer.toBinaryString(n));
		       System.out.println("Turning k'th bit off");
		       
		       return n | (1 << (k - 1));
		    }

}
