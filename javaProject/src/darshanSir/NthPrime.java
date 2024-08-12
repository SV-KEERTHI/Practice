package darshanSir;

import java.util.Iterator;
import java.util.Scanner;

public class NthPrime {
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
