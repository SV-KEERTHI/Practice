package tcs;

import java.util.Scanner;

public class ArmStrong {
	public static int length(int num) {
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}
		return count;
	}
	
	public static int pow (int base,int exp) {
		int result = 1;
		for(int i = 1; i<= exp;i++) {
			result *= base;
		}
		return result;
	}
	
	public static int ArmStrong(int num) {
		int sum = 0;
		int length = length(num);
		while(num != 0) {
			int digit = num % 10;;
			sum += pow(digit,length);
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = num;
		System.out.println(ArmStrong(num) == temp ?"Armstrong" : "Not a Armstrong");
		

	}

}
