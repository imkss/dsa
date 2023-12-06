package c_bitManipulation;

public class C_TurnOffKthBit {

	public static void main(String[] args) {


        int n = 11;
        int k = 4;
        n = turnOffKthBit(n, k);
        
        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
		System.out.println((n));
	}
	
	 public static int turnOffKthBit(int n, int k) {
		 
//		  System.out.println(n + " in binary is " + Integer.toBinaryString(n));
//	       System.out.println("Turning k'th bit off");
	       
	       return(n & ~(1 << (k - 1)));
	    }

}
