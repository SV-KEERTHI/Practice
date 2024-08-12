package darshanSir;

import java.util.Scanner;

public class PrimeRange {
	static boolean isPrime(int num) {
		if (num <= 1) {
            return false;
        }
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	static void primeRange(int min,int max) {
		for (int i = min; i <= max; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}	
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		primeRange(min,max);

	}

}
