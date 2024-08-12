package tcs;

import java.util.Scanner;

public class PalindromeRange {
	public static void PalindromeRange(int min, int max) {
		boolean found = false;
		for (int i = min; i <= max; i++) {
			if (isPalindrome(i)) {
				System.out.print(i+" ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("No palindromes found in the given range.");
		}
	}
	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse = 0;
		while (n > 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		return (temp == reverse);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		PalindromeRange(min,max);

	}

}
