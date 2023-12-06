package _Basic;

import java.util.ArrayList;

public class PrintPrime {
    public static void main(String[] args) {
        System.out.println(printPrimeNumbers(10));
    }
    public static ArrayList<Integer> printPrimeNumbers(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        primeNumbers.add(2);
        for (int i = 3; i < n * n; i+=2) { // skip over even numbers since they are not prime
            boolean isPrime = true;
            for (Integer prime : primeNumbers) { // check current prime numbers to see if it evenly divides into number
                if (i % prime == 0) { // when number is not prime
                    isPrime = false;
                    break; // optimization: stop checking when number is already not prime
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
            if(primeNumbers.size() == n) break;
        }
        return primeNumbers;
    }
}
