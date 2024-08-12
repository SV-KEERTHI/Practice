package warmup;

import java.util.Scanner;

public class charSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
