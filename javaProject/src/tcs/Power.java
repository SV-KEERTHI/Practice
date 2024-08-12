package tcs;

import java.util.Scanner;

public class Power {
	
	public static int pow (int base,int exp) {
		int result = 1;
		for(int i = 1; i<= exp;i++) {
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int exp = s.nextInt();
		int sum = 0;
		while (base != 0) {
			int rem = base % 10;
			sum += pow(rem,exp);
			base = base/ 10;
		}
		System.out.println(sum);
	}

}
