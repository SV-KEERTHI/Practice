package darshanSir;

import java.util.Scanner;

public class StringPalinrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length-1;
		boolean palindrome = false;
		while(i<j) {
			if(c[i] == c[j]) {
				palindrome = true;
				i++;
				j--;
			}
			else {
				palindrome = false;
				break;
			}		
		}
		System.out.println(palindrome ? "Palindrome" :"Not Palindrome");
	}
}
