package tcs;

import java.util.Scanner;

public class PrimeRange {
	
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
	public static void PrimeRange(int min,int max) {
		for (int i = min; i < max; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}	
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		PrimeRange(min,max);

	}

}
