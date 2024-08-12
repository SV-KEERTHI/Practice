package darshanSir;

import java.util.Scanner;

public class StringPatternDarsh {
	// Rahul wants to make a new string by using user's special number. 
	// File seed extracts the characters based on index number using digits of the number. 
	// If Digit is even and the character at that index number is a vowel then @ instead of it. 
	// If that index number is not found then use #.

	public static String getChar(int n, char[] arr) {
		if (n < arr.length) {
			char ch = arr[n];
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				return "@";
			} else {
				return Character.toString(ch);
			}
		} 
		else {
			return "#";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		int rem;
		String ans = "";
		char[] arr = s.toCharArray();
		while (n != 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				ans = getChar(rem, arr)+ans;
			}
			else {
				ans = getChar(rem, arr)+ans;
			}
			n /= 10;	
		}
		System.out.println(ans);
	}
}
