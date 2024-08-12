package tcs;

import java.util.Scanner;

public class PrimeFactorNum {
	static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2; i <= n; i++) {
			if(n % i == 0 && isPrime(i)) {
				System.out.println(i);
			}	
		}
	}
}
