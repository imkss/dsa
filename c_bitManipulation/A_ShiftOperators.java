package c_bitManipulation;

public class A_ShiftOperators {

	public static void main(String[] args) {
		
//	checkOddEven(102);
	swapTwoNum(27, 54);
	}
	
		public static void checkOddEven(int num) {
			
			if((num & 1) == 1)
			
			System.out.println(num +" is an odd number.\n");
		
		else System.out.println(num +" is an even number.\n");
	}
		
		public static void swapTwoNum(int x, int y) {
			
//	        System.out.println("Before swaping : x = "+ x + " & y = " + y);

			// x = 10, y = 5
	        // Code to swap 'x' and 'y' 
	        x = x ^ y; // x now becomes 15 (1111)
	        y = x ^ y; // y becomes 10 (1010)
	        x = x ^ y; // x becomes 5 (0101)
	 
//	        System.out.println("After swaping : x = "+ x + " & y = " + y);

		}
}
		           
	
