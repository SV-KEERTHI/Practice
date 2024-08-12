package tcs;

import java.util.Scanner;

public class LuckyEmp {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
			else 
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		int sum = 0;
		while(id != 0) {
			for (int i = 1; i <= 4; i++) {
				int rem = id % 10;
				sum = sum + rem;
				id /= 10;
			}
		}
		if(isPrime(sum)) {
			System.out.println("Lucky emp");
		}
		else {
			System.out.println("Not a Lucky emp");
		}

	}

}
