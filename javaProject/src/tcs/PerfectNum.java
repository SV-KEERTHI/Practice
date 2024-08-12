package tcs;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(num % i == 0)
				sum += i;
		}
		System.out.println(sum == num ? "Yes" : "No");
	}
}
