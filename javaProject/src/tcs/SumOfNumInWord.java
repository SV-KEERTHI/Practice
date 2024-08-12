package tcs;

import java.util.Scanner;

public class SumOfNumInWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str =s.nextLine();
		char[] c = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			if(Character.isDigit(c[i])) {
				sum += Character.getNumericValue(c[i]);
			}
		}
		System.out.println("Integer sum in a word: "+sum);

	}

}
