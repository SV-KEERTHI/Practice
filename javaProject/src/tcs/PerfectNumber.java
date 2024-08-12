package tcs;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num/2; i++) {
			if(num % i == 0 ) {
				sum += i;	
			}
		}
		return num == sum ;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		System.out.println(isPerfect(Num));

	}

}
