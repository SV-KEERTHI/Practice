package darshanSir;

import java.util.Scanner;

public class SecondHalfReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans1 = "";
		String ans2 = "";
		for (int i = 0; i < str.length()/2; i++) {
				ans1 += str.charAt(i);
		}
		for (int i =str.length()-1 ; i >= str.length()/2; i--) {
			ans1 += str.charAt(i);
			
		}
		
		System.out.println(ans1+ans2);

	}

}
