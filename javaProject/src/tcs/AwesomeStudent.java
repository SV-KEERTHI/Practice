package tcs;

import java.util.Scanner;

public class AwesomeStudent {
	public static int Fact(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = num;
		int result=0;
		while (num != 0) {
			int rem = num % 10;
			result += Fact(rem);
			num /= 10;
		}
		System.out.println(result == temp ? "Awesome Student" : "Not a Awesome student" );

	}

}
