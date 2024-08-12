package tcs;

import java.util.Scanner;

public class DummyNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			if(rem == 9)
				count ++;
			num /= 10;
		}
		System.out.println(count > 2 ? "Dummy number":"Not a Dummy number");

	}

}
