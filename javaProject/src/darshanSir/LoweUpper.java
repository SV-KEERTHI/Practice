package darshanSir;

import java.util.Scanner;

public class LoweUpper {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>='A' && c<='Z') {
				c += 32;
			}
			else if(c>='a' && c<='z') {
				c -= 32;
			}
			ans += c;

		}
		System.out.println(ans);

	}

}
