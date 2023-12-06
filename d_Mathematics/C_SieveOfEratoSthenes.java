package d_Mathematics;

import java.util.Arrays;

public class C_SieveOfEratoSthenes {

	public static void main(String[] args) {

		boolean isPrime[] = sieveOfEratoSthenes(1121);
		int count = 0;
		for(int i = 2; i <= 1121; i++) {
			System.out.println(i + " "+ isPrime[i]);
			
			if(isPrime[i] == true)
				count++;
		}	
		
		System.out.println("\nPrime numbers between 1 to "+ 1121+" are "+ count);
	}
	
	static boolean[] sieveOfEratoSthenes(int num) {
		
		boolean isPrime[] = new boolean[num+1];
		
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i* i <= num; i++) {
			
			for(int j = 2*i; j <= num; j += i) {
				
				isPrime[j] = false;
			}
			
		}
		
		return isPrime;
	}

}
