package tcs;

import java.util.Scanner;

public class FibonacciSir {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = 0,n2 = 1,sum = 0,i=1;
		while(n1<n) {
			System.out.println(n1);
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
			i++;
		}
	}

}
