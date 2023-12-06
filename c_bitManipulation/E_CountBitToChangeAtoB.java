package c_bitManipulation;

public class E_CountBitToChangeAtoB {

	public static void main(String[] args) { 
		
		int A = 3;
		int B = 15;
		
		System.out.println("A : "+ Integer.toBinaryString(A));
		System.out.println("B : "+ Integer.toBinaryString(B));

		int C =  A ^ B;
		
		 int cnt = 0;

	        while(C != 0){

	            C = C & (C-1);
	            cnt++;
	        }

	        System.out.println("The number of bits need to be changed: "+cnt);
	
	}	

}
