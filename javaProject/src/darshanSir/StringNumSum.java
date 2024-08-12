package darshanSir;

import java.util.Scanner;

public class StringNumSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int sum =0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>='0' && c<='9') {
				sum += c - '0';
			}
		}
		System.out.println("Sum of Numbers in str: "+sum);
	}
	

}
