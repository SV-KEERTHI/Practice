package tcs;

import java.util.Scanner;

public class LCM {
	public static int lcm(int a,int b) {
		GCD g1 = new GCD();
		int lcm = (a*b/g1.gcd(a, b));
		return lcm;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(lcm(c,lcm(a,b)));

	}

}
