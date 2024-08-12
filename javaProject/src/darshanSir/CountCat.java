package darshanSir;

import java.util.Scanner;

public class CountCat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i)=='c'&& str.charAt(i+1) == 'a' && str.charAt(i+2)== 't') {
				count++;
			}
		}
		System.out.println(count);
	}

}
