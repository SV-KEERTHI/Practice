package tcs;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int remaining;
		if(d <= 2) {
			System.out.println(25);
		}
		else if(d>2 && d <= 7) {
			remaining = d - 2;
			System.out.println(25+(remaining*15));
		}
		else if(d > 7 && d <= 12) {
			remaining = d - 7;
			System.out.println(25+75+(remaining*20));
		}
		else {
			remaining = d- 12;
			System.out.println(25+75+100+(remaining*25));
		}

	}

}
