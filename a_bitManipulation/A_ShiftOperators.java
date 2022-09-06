package a_bitManipulation;

public class A_ShiftOperators {

	public static void main(String[] args) {
		
	checkOddEven(18);
	swapTwoNum(48, 9);
	}
	
		public static void checkOddEven(int num) {
		
//		String bin = Integer.toBinaryString(num); 
		
//		int i = Integer.parseInt(bin);  // Convert String to integer

		if((num & 1) == 1)
			
			System.out.println(num +" is odd\n");
		
		else System.out.println(num +" is even\n");
	}
		
		public static void swapTwoNum(int x, int y) {
			
			// x = 10, y = 5
	        System.out.println("Before swap: x = "+ x + ", y = " + y);

	        // Code to swap 'x' and 'y' 
	        x = x ^ y; // x now becomes 15 (1111)
	        y = x ^ y; // y becomes 10 (1010)
	        x = x ^ y; // x becomes 5 (0101)
	 
	        System.out.println("After swap: x = "+ x + ", y = " + y);

		}
}
		           
	
