package tcs;

import java.util.Scanner;

public class SingleDigitSum {
	public static int length(int num) {
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}
		return count;
	}
	public static int sum(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		int res = sum(num);
		while (length(res) > 1) {
			res = sum(res);
		}

		System.out.println(res);
	}

}
