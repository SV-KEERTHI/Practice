package darshanSir;

import java.util.Scanner;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = "";
		int sp = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ') {
				continue;
			}
			ans += str.charAt(i);
		}
		System.out.println(ans);
	}

}
