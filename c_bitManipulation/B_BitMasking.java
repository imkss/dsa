package c_bitManipulation;

public class B_BitMasking {

	public static void main(String[] args) {
		
		findIthBit(309,8);		
//		bitCount(306);
	}	
/*FIND I th BIT*/
	
public static void findIthBit(int num, int pos) {
	int newNum = num;
	int count = pos;
	while(count > 0) {
		newNum = newNum >> 1;
		count--;
	}
	if((newNum  & 1) == 0)
		System.out.println("The "+ pos +"th binary digit of "+ num +" is 0");
	else System.out.println("The "+ pos +"th binary digit of "+ num +" is 1");
}
	
/*********************************/

	public static void bitCount(int num) {
		String bin = Integer.toBinaryString(num); // Convert Decimal number to Binary String
		System.out.println("The Binary form of "+num+ " is : "+bin ); 
		      int count1=0;
		      int count2=0;
		      for(int i=0; i<bin.length(); i++)
		       {
		           if(bin.charAt(i)=='1')		    
		               count1++;
		           else count2++;
		       } 
		       System.out.println("The number of 1's are "+count1 +" and 0's are "+ count2 +"\n");
	
	}	
	
}
