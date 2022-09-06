package a_bitManipulation;

public class B_BitMasking {

	public static void main(String[] args) {
		int dec = 448;
		String bin = Integer.toBinaryString(dec);
		System.out.println("The Binary form of "+dec+ " is : "+bin); // Convert Decimal number to Binary String
//		int num = Integer.parseInt(bin);  // Convert String to integer

		      int count1=0;
		      int count2=0;

		       for(int i=0; i<bin.length(); i++)
		       {
		           if(bin.charAt(i)=='1')		    
		               count1++;
		           else count2++;
		       } 
		       System.out.println("The number of 1's are "+count1 +" and 0's are "+ count2);
	}

}
