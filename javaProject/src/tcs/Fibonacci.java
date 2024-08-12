package tcs;

import java.util.Scanner;

public class Fibonacci {
	static void fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3= 0;
		int i = 1;
		while(i <= n-2) {
			n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		fibonacci(10);


	}

}
