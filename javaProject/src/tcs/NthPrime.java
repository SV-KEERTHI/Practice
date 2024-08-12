package tcs;

import java.util.Scanner;

public class NthPrime {
	static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}	
		}
		return count == 2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i = 1;; i++) {
			if(isPrime(i)) {
				count++;
				if(count == n) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}


