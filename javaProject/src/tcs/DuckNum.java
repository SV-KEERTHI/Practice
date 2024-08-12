package tcs;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean isDuck = false;
		while (num != 0) {
			int rem = num % 10;
			if(rem == 0) {
				isDuck = true;
				break;
			}
			else {
				num  /= 10;
			}
		}
		System.out.println(isDuck ? "Duck Number" : "Not a Duck Number");

	}

}
