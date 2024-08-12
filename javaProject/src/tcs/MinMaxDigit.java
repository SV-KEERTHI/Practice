package tcs;

import java.util.Scanner;

public class MinMaxDigit {
	static void MaxMin(int num) {
		int small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int d;
		while(num != 0) {
			d = num % 10;
			small = Math.min(small, d);
			large = Math.max(large, d);
			num /= 10;
		}
		System.out.println("Small digit: "+small);
		System.out.print("Large digit: "+large);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		MaxMin(n);

	}

}
